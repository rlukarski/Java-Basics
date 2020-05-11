package L02.SimpleCalculation;

import java.util.Scanner;

public class HappyBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double aquaArea = length * width * height;
        double litres = aquaArea * 0.001;
        double percentage = percent * 0.01;
        double realLitre = litres * (1 - percentage);
        System.out.printf("%.3f", realLitre);
    }
}
