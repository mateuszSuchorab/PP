package com.project.pp.Controller;


import com.project.pp.DTO.ResultDTO;
import com.project.pp.Service.LoopService;
import com.project.pp.Service.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MyRestController {

    private final LoopService loopService;
    private final StringService stringService;

    @GetMapping("/simpleFor")
    public ResultDTO simpleFor() {
        return new ResultDTO(loopService.simpleFor());
    }

    @GetMapping("/simpleForeach")
    public ResultDTO simpleForeach() {
        return new ResultDTO(loopService.simpleForeach());
    }

    @GetMapping("/foreachJavaEight")
    public ResultDTO foreachJavaEight() {
        return new ResultDTO(loopService.foreachJavaEight());
    }

    @GetMapping("/simpleWhile")
    public ResultDTO simpleWhile() {
        return new ResultDTO(loopService.simpleWhile());
    }

    @GetMapping("/buildString")
    public ResultDTO buildString() {
        return new ResultDTO(stringService.buildString());
    }

    @GetMapping("/buildStringTwo")
    public ResultDTO buildStringTwo() {
        return new ResultDTO(stringService.buildStringTwo());
    }

    @GetMapping("/buildStringThree")
    public ResultDTO buildStringThree() {
        return new ResultDTO(stringService.buildStringThree());
    }
}