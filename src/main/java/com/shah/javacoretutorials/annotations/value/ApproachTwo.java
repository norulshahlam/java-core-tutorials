package com.shah.javacoretutorials.annotations.value;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * @author NORUL
 */
@ConfigurationProperties(prefix = "openapi")
@ConstructorBinding
@AllArgsConstructor
@Getter
@ToString
public class ApproachTwo {
    private final String projectTitle;
    private final String projectDescription;
    private final String projectVersion;
}
