/**
 * Title: Kombinasyon Application
 * Author: Kadir Tuna
 * Description: Kombinasyon app calculates the combination with given the number n and the number r. It is carried out with the manner the rth combination of n .
 * Assignment: Java101-Patika.Dev
 * Contacts;
 * Instagram: kadir.tuna
 * Github : github.com/kadirtuna
 * LinkedIn : linkedin.com/in/kadirtuna20
 *
 * by;
 * @author Kadir Tuna
 */

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r;

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the number n for combination calculation: ");
        n = scan.nextInt();
        System.out.println("Type the number r for the rest of the calculation: ");
        r = scan.nextInt();

        System.out.println("The " + r + "th combination of " + n + " is: " + combination(n, r));
    }

    public static int combination(int n, int r){
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

