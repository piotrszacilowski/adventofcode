package day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class solutions {

    public static double requiredFuel(int mass) {
        return (Math.floor(mass / 3)) - 2;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String nameFile = "input/input01.txt";
        File file = new File(nameFile);
        Scanner scan = new Scanner(file);
        int sum = 0;

        while (scan.hasNext()) {
            int mass = scan.nextInt();
            double fuel = requiredFuel(mass);
            sum += fuel;
        }

        System.out.println("Total fuel required is: " + sum);
    }
}
