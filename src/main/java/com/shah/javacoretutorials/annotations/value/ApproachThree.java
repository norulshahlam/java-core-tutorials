package com.shah.javacoretutorials.annotations.value;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ApproachThree {

    /* You can insert a default value if not defined yet */
    @Value("${openapi.project-description:defaultstatus}")
    private String projectDescription;
    @Value("${openapi.project-title}")
    private String projectTitle;
    @Value("${openapi.project-version}")
    private String projectVersion;
}
