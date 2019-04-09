package learn.agile.demos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import learn.agile.demos.services.CalculatorService;

/**
 * @author pcooke
 *
 */
@RestController
public class CalculatorController {

    /**
     * Calculator service.
     */
    @Autowired
    private CalculatorService calculatorService;

    /**
     * Controller add function.
     * @param firstNumber First Operand.
     * @param secondNumber Second Operand.
     * @return int The result of the add operation
     */
    @RequestMapping("/adder")
    public final int adder(
            @RequestParam(value = "firstNumber", defaultValue = "0") final int firstNumber,
            @RequestParam(value = "secondNumber", defaultValue = "0") final int secondNumber) {
        return calculatorService.add(firstNumber, secondNumber);
    }
}
