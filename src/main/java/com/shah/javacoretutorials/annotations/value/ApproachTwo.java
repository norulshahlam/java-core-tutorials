package com.shah.javacoretutorials.annotations.value;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author NORUL
 */
@ConfigurationProperties(prefix = "openapi")
@AllArgsConstructor
@Getter
@ToString
public class ApproachTwo {
    private final String projectDescription;
    private final String projectTitle;
    private final String projectVersion;
}
