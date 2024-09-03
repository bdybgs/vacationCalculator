package com.example.VacationCalculator.controller;

import com.example.VacationCalculator.service.VacationCalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculate")
public class VacationCalculatorController {
    private final VacationCalculatorService vacationCalculatorService;

    @GetMapping
    public int get(@RequestParam int salaryPerYear,
                   @RequestParam int amountOfVacation) {
        return vacationCalculatorService.calculateVacationPay(salaryPerYear, amountOfVacation);
    }
}
