package com.example.VacationCalculator;

import com.example.VacationCalculator.controller.VacationCalculatorController;
import com.example.VacationCalculator.service.VacationCalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VacationCalculatorApplicationTests {

	@Test
	void calculationShouldBeTrue() {
		VacationCalculatorController vacationCalculatorController =
				new VacationCalculatorController(new VacationCalculatorService());
		var res = vacationCalculatorController.get(365000, 12);
		Assertions.assertEquals(12000, res);
	}

	@Test
	void calculationShouldBeZero() {
		VacationCalculatorController vacationCalculatorController =
				new VacationCalculatorController(new VacationCalculatorService());
		var res = vacationCalculatorController.get(100000, 0);
		Assertions.assertEquals(0, res);
	}

}
