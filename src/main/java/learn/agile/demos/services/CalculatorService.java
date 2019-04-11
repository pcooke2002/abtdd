package learn.agile.demos.services;

import org.springframework.stereotype.Service;

/**
 * @author pcooke
 *
 */
@Service
public class CalculatorService {
    /**
     * a variable for spotbugs to find.
     */
    int notUsedVariableForScanBugs;

    /**
     * divide 2 numbers.
     * @param x First Operand.
     * @param y Second Operand.
     * @return the result of the divide.
     */
    public float divide(final float x, final float y) {
        return x / y;
    }
}
