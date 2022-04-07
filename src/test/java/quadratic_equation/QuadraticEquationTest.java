package quadratic_equation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticEquationTest {
    @Test
    public void discriminantMoreThanZero() {
        int a = 1;
        int b = -4;
        int c = -5;
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.solveQuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.solution);
        Assert.assertNotEquals(quadraticEquation.solution.getX1(), quadraticEquation.solution.getX2(), "The roots are the same");
    }

    @Test
    public void discriminantIsZero() {
        int a = 9;
        int b = 6;
        int c = 1;
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.solveQuadraticEquation(a, b, c);
        Assert.assertEquals(quadraticEquation.solution.getX1(), quadraticEquation.solution.getX2(), "The roots aren`t the same");
    }

    @Test
    public void discriminantLessThanZero() {
        int a = 3;
        int b = -4;
        int c = 2;
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.solveQuadraticEquation(a, b, c);
        Assert.assertTrue(quadraticEquation.solution == null, "The roots aren`t the same");
    }
}