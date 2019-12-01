package day01;

public class solutions {

    public double requiredFuel(double m) {
        return (Math.floor(m / 3)) - 2;
    }

    public static void main(String[] args) {
        solutions solutions = new solutions();
        System.out.println(solutions.requiredFuel(12));
        System.out.println(solutions.requiredFuel(14));
        System.out.println(solutions.requiredFuel(1969));
        System.out.println(solutions.requiredFuel(100756));
    }
}
