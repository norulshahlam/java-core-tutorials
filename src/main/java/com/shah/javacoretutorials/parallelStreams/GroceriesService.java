package com.shah.javacoretutorials.parallelStreams;

import com.github.javafaker.Faker;
import com.shah.javacoretutorials.model.GroceriesDiscount;
import com.shah.javacoretutorials.model.GroceriesInfo;
import com.shah.javacoretutorials.model.GroceriesResponse;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.shah.javacoretutorials.util.CommonUtil.delay;
import static com.shah.javacoretutorials.util.CommonUtil.log;

@Service
public class GroceriesService {

    Faker faker = new Faker();
    RandomDataGenerator random = new RandomDataGenerator();

    public GroceriesDiscount getDiscountList(int id) {

        delay(1000);

        return GroceriesDiscount.builder()
                .id(random.nextLong(1, 50))
                .discount(true)
                .discPercent((random.nextLong(1, 50)))
                .build();
    }

    public GroceriesInfo getInfoList(int id) {

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
        while (id > 0) {
            int finalId = id;
            CompletableFuture<GroceriesDiscount> async = CompletableFuture.supplyAsync(() -> getDiscountList(finalId));
            list.add(async);
            id--;
        }
        return list.stream().map(CompletableFuture::join).toList();
    }

    public String hello() {
        delay(1000);
        log("inside hello");
        return "hello";
    }

    public String world() {
        delay(1000);
        log("inside world");
        return " world!";
    }

}