package com.project.pp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/forLoop")
    public String forLoop() {
        return "forLoop";
    }

    @GetMapping("/database")
    public String database() {
        return "database";
    }

    @GetMapping("/stringCreator")
    public String stringCreator() {return "stringCreator";
    }

}
