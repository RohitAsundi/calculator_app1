package com.ascent.calculator_app.controller;
import com.ascent.calculator_app.model.Numbers;
import com.ascent.calculator_app.service.CalculatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class calculatorController {
        CalculatorService calculatorService;

        public calculatorController(CalculatorService calculatorService) {
            this.calculatorService = calculatorService;
        }

        @PostMapping("/add")
        public double add(@RequestBody Numbers numbers) {
            return calculatorService.add(numbers.getNum1(), numbers.getNum2());
        }

        @PostMapping("/sub")
        public double sub(@RequestBody Numbers numbers) {
            return calculatorService.sub(numbers.getNum1(), numbers.getNum2());
        }

        @PostMapping("/mul")
        public double mul(@RequestBody Numbers numbers) {
            return calculatorService.mul(numbers.getNum1(), numbers.getNum2());
        }

        @PostMapping("/div")
        public double div(@RequestBody Numbers numbers) {
            return calculatorService.div(numbers.getNum1(), numbers.getNum2());
        }
    }
