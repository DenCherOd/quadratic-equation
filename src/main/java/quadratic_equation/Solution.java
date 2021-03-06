package quadratic_equation;

import java.util.Objects;

public class Solution {
    private double x1;
    private double x2;

    public Solution(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public String toString() {
        return x1 + " " + x2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return Double.compare(solution.x1, x1) == 0 ||
                Double.compare(solution.x1, x2) == 0
                        && Double.compare(solution.x2, x2) == 0 ||
                Double.compare(solution.x2, x1) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, x2);
    }
}