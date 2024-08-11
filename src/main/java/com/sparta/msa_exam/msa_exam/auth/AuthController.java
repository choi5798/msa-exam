package com.sparta.msa_exam.msa_exam.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/signIn")
    public String signIn(@RequestParam("user_id") String userId) {
        return null;
    }

}
