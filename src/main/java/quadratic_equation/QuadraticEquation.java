package quadratic_equation;

public class QuadraticEquation {
    private double discriminant;
    Solution solution;

    public double getDiscriminant() {
        return discriminant;
    }

    public Solution solveQuadraticEquation(int a, int b, int c) {
        solution = new Solution();
        discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant > 0) {
            solution.setX1((-b + Math.sqrt(discriminant)) / (2 * a));
            solution.setX2((-b - Math.sqrt(discriminant)) / (2 * a));
        } else if (discriminant == 0) {
            solution.setX1(-b / (2 * a));
            solution.setX2(solution.getX1());
        } else if (discriminant < 0) {
            solution = null;
        }

        return solution;
    }
}