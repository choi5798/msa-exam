<<<<<<< HEAD
<<<<<<<< HEAD:Auth/src/main/java/com/sparta/msa_exam/auth/AuthApplication.java
package com.sparta.msa_exam.auth;
========
package com.sparta.msa_exam;
>>>>>>>> 917fac1 (feat: Msa 전환):src/main/java/com/sparta/msa_exam/MsaExamApplication.java

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
<<<<<<<< HEAD:Auth/src/main/java/com/sparta/msa_exam/auth/AuthApplication.java
public class AuthApplication {
========
@EnableEurekaServer
public class MsaExamApplication {
>>>>>>>> 917fac1 (feat: Msa 전환):src/main/java/com/sparta/msa_exam/MsaExamApplication.java
=======
package com.sparta.msa_exam.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthApplication {
>>>>>>> a6ea2fd (feat: 멀티 모듈 구성)

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}
