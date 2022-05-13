package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new 하는 것이 아니라
            // 특정 annotation이 붙어있는 class file new 해서(Ioc) 스프링 컨테이너에 관리해준다.
public class BlogControllerTest {

    //http://localhost:8080/test/hello
    @GetMapping("/test/hello")
    public String Hello(){
        return "<h1>Hello Spring boot</h1>";
    }
}
