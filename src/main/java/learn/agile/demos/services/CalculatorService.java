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
    private final int notUsedVariableForScanBugs = 0;

    /**
     * add 2 numbers.
     * @param x First Operand.
     * @param y Second Operand.
     * @return the result of the multiplication
     */
    public final float multiply(final float x, final float y) {
        return x * y;
    }
}
