package com.kr.cdci.web.main;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class MainController {
    @RequestMapping("/hello")
    public String index() {
        log.info("helloo");
        return "/hello";
    }
}
