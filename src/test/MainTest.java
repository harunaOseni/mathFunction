package src.test;

import static org.junit.Assert.fail;
import org.junit.Test;

import src.Main;

public class MainTest {

    @Test
    public void testMathFunction() {
        // code to test mathFunction
        try {
            Main main = new Main();
            if (main.mathFunction(1, 2, 3).equals("+")) {
                System.out.println("+");
            } else {
                fail("mathFunction(1, 2, 3) should return +");
            }
            if (main.mathFunction(2, 2, 4).equals("+*")) {
                System.out.println("+*");
            } else {
                fail("mathFunction(2, 2, 4) should return +*");
            }
            if (main.mathFunction(3, -3, -9).equals("*")) {
                System.out.println("*");
            } else {
                fail("mathFunction(3, -3, -9) should return *");
            }
            if (main.mathFunction(1, 2, -1).equals("-")) {
                System.out.println("-");
            } else {
                fail("mathFunction(1, 2, -1) should return -");
            }
            if (main.mathFunction(3, 3, 1).equals("/")) {
                System.out.println("/");
            } else {
                fail("mathFunction(3, 3, 1) should return /");
            }
            if (main.mathFunction(7, 1, 11).equals("None")) {
                System.out.println("None");
            } else {
                fail("mathFunction(7, 1, 11) should return None");
            }
        } catch (Exception e) {
            fail("Exception thrown: " + e);
        }
    }
}