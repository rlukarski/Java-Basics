package L01.First_Steps_In_Coding;

import java.util.Scanner;

public class RectangleArea {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print(a * b);
    }
}
