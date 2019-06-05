package com.project.pp.Controller;


import com.project.pp.DTO.ResultDTO;
import com.project.pp.Service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MyRestController {

    private final LoopService loopService;
    private final StringService stringService;
    private final ReplaceStringService replaceStringService;
    private final PrimitiviesSrevice primitiviesSrevice;
    private final FormatStringService formatStringService;
    private final ArrayListService arrayListService;
    private final MathService mathService;


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

    @GetMapping("/addStrings")
    public ResultDTO addStrings() {
        return new ResultDTO(stringService.addStrings());
    }

    @GetMapping("/stringBuilder")
    public ResultDTO stringBuilder() {
        return new ResultDTO(stringService.stringBuilder());
    }

    @GetMapping("/addMultipleStrings")
    public ResultDTO addMultipleStrings() {
        return new ResultDTO(stringService.addMultipleStrings());
    }

    @GetMapping("/stringBuilderMultiple")
    public ResultDTO stringBuilderMultiple() {
        return new ResultDTO(stringService.stringBuilderMultiple());
    }

    @GetMapping("/addMultipleStringsNotOneRow")
    public ResultDTO addMultipleStringsNotOneRow() {
        return new ResultDTO(stringService.addMultipleStringsNotOneRow());
    }

    @GetMapping("/stringReplaceRest")
    public ResultDTO stringReplaceRest() {
        return new ResultDTO(replaceStringService.stringReplace());
    }

    @GetMapping("/superStringReplace")
    public ResultDTO superStringReplace() {
        return new ResultDTO(replaceStringService.superStringReplace());
    }

    @GetMapping("/simpleInteger")
    public ResultDTO simpleInteger() {
        return new ResultDTO(primitiviesSrevice.simpleInteger());
    }

    @GetMapping("/classInteger")
    public ResultDTO classInteger() {
        return new ResultDTO(primitiviesSrevice.classInteger());
    }

    @GetMapping("/classBigDecimal")
    public ResultDTO classBigDecimal() {
        return new ResultDTO(primitiviesSrevice.classBigDecimal());
    }

    @GetMapping("/classBigInteger")
    public ResultDTO classBigInteger() {
        return new ResultDTO(primitiviesSrevice.classBigInteger());
    }

    @GetMapping("/stringFormat")
    public ResultDTO stringFormat() {
        return new ResultDTO(formatStringService.stringFormat());
    }

    @GetMapping("/stringConcat")
    public ResultDTO stringConcat() {
        return new ResultDTO(formatStringService.stringConcat());
    }

    @GetMapping("/testStream")
    public ResultDTO testStream() {
        return new ResultDTO(arrayListService.testStream());
    }

    @GetMapping("/testFor")
    public ResultDTO testFor() {
        return new ResultDTO(arrayListService.testFor());
    }

    @GetMapping("/testStreamParrallel")
    public ResultDTO testStreamParrallel() {
        return new ResultDTO(arrayListService.testStreamParrallel());
    }
    @GetMapping("/oneLine")
    public ResultDTO oneLine() {
        return new ResultDTO(mathService.oneLine());
    }
    @GetMapping("/twoLine")
    public ResultDTO twoLine() {
        return new ResultDTO(mathService.twoLine());
    }

}