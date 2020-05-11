package L02.SimpleCalculation;

import java.util.Scanner;

public class TrapezеArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double result = (a + b) * h / 2;
        System.out.println(result);
    }
}
