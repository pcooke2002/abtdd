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
     * Controller subtract function.
     * @param firstNumber First Operand.
     * @param secondNumber Second Operand.
     * @return int The result of the subtract operation
     */
    @RequestMapping("/subtracter")
    public final float subtracter(
            @RequestParam(value = "firstNumber", defaultValue = "0f") final float firstNumber,
            @RequestParam(value = "secondNumber", defaultValue = "0f") final float secondNumber) {
        return calculatorService.subtract(firstNumber, secondNumber);
    }
}
