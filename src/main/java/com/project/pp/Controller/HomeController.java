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

    @GetMapping("/stringCreator")
    public String stringCreator() {return "stringCreator";}


    //TODO
    @GetMapping("/stringReplace")
    public String stringReplace() {return "stringReplace";}

    @GetMapping("/primitivies")
    public String primitivies() {
        return "primitivies";
    }

    @GetMapping("/formatString")
    public String formatString() {return "formatString";}

    @GetMapping("/arrayList")
    public String arrayList() {return "arrayList";}

    @GetMapping("/math")
    public String math() {return "math";}

}
