package com.shah.javacoretutorials.parallelStreams;

import com.github.javafaker.Faker;
import com.shah.javacoretutorials.model.GroceriesDiscount;
import com.shah.javacoretutorials.model.GroceriesInfo;
import com.shah.javacoretutorials.model.GroceriesResponse;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.shah.javacoretutorials.util.CommonUtil.delay;
import static com.shah.javacoretutorials.util.CommonUtil.log;

public class GroceriesService {

    @Autowired
    private HelloWorldService helloWorldService;

    Faker faker = new Faker();
    RandomDataGenerator random = new RandomDataGenerator();

    int processors = Runtime.getRuntime().availableProcessors();
    ExecutorService executorService = Executors.newFixedThreadPool(50);

    public GroceriesDiscount getDiscountList(int id) {
        log("inside getDiscountList");
        delay(1000);

        return GroceriesDiscount.builder()
                .id(random.nextLong(1, 50))
                .discount(true)
                .discPercent((random.nextLong(1, 50)))
                .build();
    }

    public GroceriesInfo getInfoList(int id) {
        log("inside getInfoList");
        delay(1000);

        return GroceriesInfo.builder()
                .id(random.nextLong(1, 100))
                .item(faker.food().ingredient())
                .brand(faker.food().spice())
                .country(faker.country().name())
                .quantity(random.nextLong(50, 200))
                .category(faker.cat().breed())
                .costPrice(BigDecimal.valueOf(35.74))
                .expiryDate(LocalDate.of(2022, 01, 26))
                .arrivalDate(LocalDate.of(2021, 12, 10))
                .build();
    }

    public CompletableFuture<GroceriesResponse> getOneGrocery(int id) {
        CompletableFuture<GroceriesDiscount> discount = CompletableFuture
                .supplyAsync(() -> getDiscountList(id));
        CompletableFuture<GroceriesInfo> info = CompletableFuture
                .supplyAsync(() -> getInfoList(id));
        return discount.thenCombine(info, (d, i) ->
                GroceriesResponse.builder().groceriesInfo(i).groceriesDiscount(d).build()
        );
    }

    public List<GroceriesDiscount> getGroceryDiscountList(int id) {
        ArrayList<CompletableFuture<GroceriesDiscount>> list = new ArrayList<>();
        int finalId = id;
        while (id > 0) {
            CompletableFuture<GroceriesDiscount> async = CompletableFuture.supplyAsync(() -> getDiscountList(finalId));
            list.add(async);
            id--;
        }
        return list.stream().map(CompletableFuture::join).toList();
    }

    public List<GroceriesDiscount> getGroceryDiscountListUsingExecutor(int id) {
        ArrayList<CompletableFuture<GroceriesDiscount>> list = new ArrayList<>();
        int finalId = id;
        while (id > 0) {
            CompletableFuture<GroceriesDiscount> async = CompletableFuture.supplyAsync(() -> getDiscountList(finalId), executorService);
            list.add(async);
            id--;
        }
        return list.stream().map(CompletableFuture::join).toList();
    }

    public String asyncWithExceptionalHandling() {
        /**
         * This method includes exception handling with recovery - you can return a value during exception.
         * thenCombine is a BiFunction while thenApply is a Function.
         * Both takes input/s & transforms it into output.
         */
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> helloWorldService.hello());

        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> helloWorldService.world());

        return hello.exceptionally((e) -> {
                    log("Exception in hello: " + e.getMessage());
                    return "Exception in hello!";
                })
                .thenCombine(world, (h, w) -> h + w)
                .exceptionally((e) -> {
                    log("Exception after world: " + e.getMessage());
                    return "Exception after world!";
                })
                .thenApply(i -> i + " A SUCCESS!")
                .join();
    }

}