package com.sparta.msa_exam.product;

import jakarta.servlet.http.HttpServletResponse;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class HeaderAdvice {

    @Value("${server.port}")
    private String port;

    @After("execution(* com.sparta.msa_exam.product.ProductController.*(..))")
    public void addHeader() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (requestAttributes != null) {
            HttpServletResponse response = requestAttributes.getResponse();
            if (response != null) {
                response.addHeader("Server-Port", port);
            }
        }
    }

}
