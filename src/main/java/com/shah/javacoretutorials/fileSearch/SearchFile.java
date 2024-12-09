package com.shah.javacoretutorials.fileSearch;

import com.opencsv.bean.CsvToBeanBuilder;
import com.shah.javacoretutorials.model.Course;
import com.shah.javacoretutorials.model.GroceriesInfo;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.currentTimeMillis;

@Slf4j
public class SearchFile {

    @Value("src/main/resources/")
    private String pathLocation;

    @SneakyThrows
    public Path searchFile(String filename, String suffix) {
        log.info("Searching filename: [{}] with suffix: [{}] in location [{}]", filename, suffix, pathLocation);

        try (Stream<Path> files =
                     Files.find(Paths.get(pathLocation), 1, ((path, fileAttributes) -> path.getFileName().toString().contains(filename) && path.getFileName().toString().endsWith(suffix)))) {
            return files.min((p1, p2) -> {
                try {
                    return Files.getLastModifiedTime(p2).compareTo(Files.getLastModifiedTime(p1));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).orElseThrow(() -> new FileSystemNotFoundException(filename + " Could not be found in " + pathLocation));
        }
    }

    public List<GroceriesInfo> txtPortfolioParser(@NotNull Path path) throws IOException {
        log.info("inside txtPortfolioParser. Parsing filename: {}", path.getFileName());

        long start = currentTimeMillis();

        List<String> adaData = Files.readAllLines(path);

        /* Remove the header and footer */
        List<GroceriesInfo> gsmPortfolioEntityList = IntStream
                .range(1, adaData.size() - 1)
                .mapToObj(adaData::get)
                .toList()
                .stream()
                .map(line -> {
                    String[] split = line.split("\\t");
                    return GroceriesInfo.builder()
                            .id(Long.valueOf(split[0]))
                            .item(split[1])
                            .brand(split[2])
                            .country(split[3])
                            .costPrice(new BigDecimal(split[4]))
                            .build();
                })
                .collect(Collectors.toList());

        log.info("Time taken for txtPortfolioParser: [{}] ms", currentTimeMillis() - start);

        int pre = Files.readAllLines(path).size() - 2;
        int post = gsmPortfolioEntityList.size();
        log.info("No of rows pre_parsing: [{}], No of rows post_parsing: [{}], Difference: [{}]", pre, post, pre - post);

        return gsmPortfolioEntityList;
    }

    public List<Course> csvTransactionsParser(@NotNull Path path) throws IOException {
        log.info("inside csvTransactionsParser. Parsing filename: {}", path.getFileName());

        long start = currentTimeMillis();

        List<Course> transactionsEntities = new CsvToBeanBuilder<Course>(
                new FileReader(path.toFile())
        )
                .withType(Course.class)
                .withIgnoreQuotations(false)
                .withIgnoreLeadingWhiteSpace(false)
                .build()
                .parse();

        log.info("Time taken for csvTransactionsParser: [{}] ms", currentTimeMillis() - start);

        int pre = Files.readAllLines(path).size() - 1;
        int post = transactionsEntities.size();
        log.info("No of rows pre_parsing: [{}], No of rows post_parsing: [{}], Difference: [{}]", pre, post, pre - post);

        return transactionsEntities;
    }


}
