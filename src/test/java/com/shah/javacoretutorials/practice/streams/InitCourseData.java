package com.shah.javacoretutorials.practice.streams;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.shah.javacoretutorials.model.Groceries;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class InitCourseData {
    static ObjectMapper mapper = new ObjectMapper();

    public static List<Groceries> init() throws IOException {
        mapper.registerModule(new JavaTimeModule());
        List<Groceries> groceries = mapper.readValue(new File("src/main/resources/groceries.json"), new TypeReference<List<Groceries>>() {});
        return groceries;
    }
}
