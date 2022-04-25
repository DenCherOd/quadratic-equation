package quadratic_equation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticEquationTest {
    @Test
    public void discriminantMoreThanZero() {
        Solution expectedSolution = new Solution(5, -1);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Solution actualEquation = quadraticEquation.solveQuadraticEquation(1, -4, -5);
        Assert.assertNotEquals(actualEquation.getX1(), actualEquation.getX2(), "The roots are the same");
        Assert.assertEquals(expectedSolution, actualEquation, "The roots are not correct");
    }

    @Test
    public void discriminantIsZero() {
        Solution expectedSolution = new Solution(1, -1);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Solution actualEquation = quadraticEquation.solveQuadraticEquation(1,2,1);
        Assert.assertEquals(actualEquation.getX1(), actualEquation.getX2(), "The roots aren`t the same");
        Assert.assertEquals(expectedSolution, actualEquation, "The roots are not correct");

    }

    @Test
    public void discriminantLessThanZero() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Solution actualEquation = quadraticEquation.solveQuadraticEquation(3, -4, 2);
        Assert.assertTrue(actualEquation == null, "Discriminant is more than zero");
    }
}