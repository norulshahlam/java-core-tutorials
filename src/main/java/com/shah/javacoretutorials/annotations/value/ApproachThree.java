package com.shah.javacoretutorials.annotations.value;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ApproachThree {

    @Value("${email.username}")
    private String username;
    @Value("${email.password}")
    private String password;
    /* You can insert a default value if not defined yet */

    @Value("${email.status:defaultstatus}")
    private String status;

}
