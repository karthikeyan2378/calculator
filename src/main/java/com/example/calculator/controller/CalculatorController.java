package com.example.calculator.controller;

import com.example.calculator.dto.ResponseDTO;
import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping("/add/{a}/{b}")
    public ResponseDTO add(@PathVariable int a, @PathVariable int b) {
        int res =  calculatorService.add(a,b);

        return new ResponseDTO("ADD", a, b, res);


    }

    @GetMapping("/sub/{a}/{b}")
    public ResponseDTO sub(@PathVariable int a, @PathVariable int b) {
        int res =  calculatorService.subtract(a,b);
        return new ResponseDTO("SUB", a, b, res);

    }

    @GetMapping("/multiply/{a}/{b}")
    public ResponseDTO multiply(@PathVariable int a, @PathVariable int b) {
        int res =  calculatorService.multiply(a,b);
        return new ResponseDTO("MUL", a, b, res);

    }

    @GetMapping("/divide/{a}/{b}")
    public ResponseDTO divide(@PathVariable int a, @PathVariable int b) {
        int res =  calculatorService.divide(a,b);
        return new ResponseDTO("DIV", a, b, res);

    }


}
