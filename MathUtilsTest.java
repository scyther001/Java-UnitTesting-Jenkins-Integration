import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class MathUtilsTest {

    private MathUtils math;

    // Setup method to initialize MathUtils before each test
    @Before
    public void setUp() {
        math = new MathUtils(); // MathUtils ka object create karte hain
    }

    // Cleanup method to nullify MathUtils after each test
    @After
    public void tearDown() {
        math = null; // Test ke baad object ko null kar dete hain
    }

    // Test case for add method
    @Test
    public void testAdd() {
        assertEquals("Addition should return correct result", 8, math.add(5, 3)); // Expected: 5 + 3 = 8
    }

    // Test case for subtract method
    @Test
    public void testSubtract() {
        assertEquals("Subtraction should return correct result", 2, math.subtract(5, 3)); // Expected: 5 - 3 = 2
    }

    // Test case for multiply method
    @Test
    public void testMultiply() {
        assertEquals("Multiplication should return correct result", 15, math.multiply(5, 3)); // Expected: 5 * 3 = 15
    }

    // Test case for divide method with valid division
    @Test
    public void testDivide() {
        assertEquals("Division should return correct result", 1.6666666666666667, math.divide(5, 3), 0.0001);
        // Expected: 5 / 3 = 1.666... with a small delta for floating point comparison
    }

    // Test case for divide method with division by zero
    @Test
    public void testDivideByZero() {
        assertEquals("Division by zero should return -1.0", -1.0, math.divide(5, 0), 0.0001);
    }

    // Edge case for subtracting negative numbers
    @Test
    public void testSubtractNegative() {
        assertEquals("Subtraction with negative numbers should return correct result", -8, math.subtract(-5, 3)); // Expected: -5 - 3 = -8
    }

    // Test case for multiply with large numbers
    @Test
    public void testMultiplyLargeNumbers() {
        assertEquals("Multiplication with large numbers should return correct result", 100000000, math.multiply(10000, 10000));
    }
}
