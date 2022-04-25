package quadratic_equation;

public class QuadraticEquation {
    Solution solution;

    public Solution solveQuadraticEquation(int a, int b, int c) {
        if (a == 0) {
            throw new IllegalArgumentException("a should not equal 0");
        }
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant < 0) {
            return null;
        }
        double x1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
        double x2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
        solution = new Solution(x1, x2);


        return new Solution(x1, x2);
    }
}