package com.example.VacationCalculator.service;

import org.springframework.stereotype.Service;

@Service
public class VacationCalculatorService {

    public int calculateVacationPay(int salaryPerYear, int amountOfVacation) {
        int daysInYear = 365;
        return salaryPerYear / daysInYear * amountOfVacation;
    }
}
