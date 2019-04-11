package learn.agile.demos.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author pcooke
 *
 */
public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    /**
     * @throws Exception
     */
    @Test
    public void testAdd() throws Exception {
        assertEquals(1, calculatorService.add(1, 0));
        assertEquals(2, calculatorService.add(1, 1));
        assertEquals(10, calculatorService.add(5, 5));
        assertEquals(100, calculatorService.add(75, 25));
    }
    
    /**
     * @throws Exception
     */
    @Test
    public void testSubtract() throws Exception {
        assertEquals(1, calculatorService.subtract(1, 0));
        assertEquals(0, calculatorService.subtract(1, 1));
        assertEquals(0, calculatorService.subtract(5, 5));
        assertEquals(50, calculatorService.subtract(75, 25));
    }

    /**
     * @throws Exception
     */
    @Test
    public void testMultipyInteger() throws Exception {
        assertEquals(0, calculatorService.multiply(1, 0));
        assertEquals(1, calculatorService.multiply(1, 1));
        assertEquals(25, calculatorService.multiply(5, 5));
        assertEquals(1875, calculatorService.multiply(75, 25));
    }

    /**
     * @throws Exception
     */
    @Test
    public void testAddWithNegativeNumbers() throws Exception {
        assertEquals(-1, calculatorService.add(-1, 0));
        assertEquals(-2, calculatorService.add(-1, -1));
        assertEquals(0, calculatorService.add(1, -1));
        assertEquals(-5, calculatorService.add(5, -10));
        assertEquals(-50, calculatorService.add(-75, 25));
    }

    /**
     * @throws Exception
     */
    public void testSubtractWithNegativeNumbers() throws Exception {
        assertEquals(-1, calculatorService.subtract(-1, 0));
        assertEquals(0, calculatorService.subtract(-1, -1));
        assertEquals(2, calculatorService.subtract(1, -1));
        assertEquals(15, calculatorService.subtract(5, -10));
        assertEquals(-100, calculatorService.subtract(-75, 25));
    }
    
    /**
     * @throws Exception
     */
    public void testMultiplyWithNegativeInteger() throws Exception {
        assertEquals(0, calculatorService.multiply(-1, 0));
        assertEquals(1, calculatorService.multiply(-1, -1));
        assertEquals(-1, calculatorService.multiply(1, -1));
        assertEquals(-50, calculatorService.multiply(5, -10));
        assertEquals(-1875, calculatorService.multiply(-75, 25));
    }

    /**
     * @throws Exception
     */
    public void testDivideIntegerByIntResultWholeInt() throws Exception {
        assertEquals(1, calculatorService.divide(1, 1));
        assertEquals(5, calculatorService.divide(25, 5));
    }
}
