package com.shah.javacoretutorials.parallelStreams;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.shah.javacoretutorials.model.GroceriesInfo;
import com.shah.javacoretutorials.model.GroceriesDiscount;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class InitData {
    static ObjectMapper mapper = new ObjectMapper();

    public static List<GroceriesInfo> initGroceries() throws IOException {
        mapper.registerModule(new JavaTimeModule());
        return mapper.readValue(new File("src/main/resources/groceries.json"), new TypeReference<>() {
        });
    }

    public static List<GroceriesDiscount> initGroceriesDiscount() throws IOException {
        mapper.registerModule(new JavaTimeModule());
        return mapper.readValue(new File("src/main/resources/groceries-discount.json"), new TypeReference<>() {
        });
    }

}
