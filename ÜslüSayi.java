/**
 * Title: ÜslüSayi Application
 * Author: Kadir Tuna
 * Description: The app calculates and prints out the result of the rth power of n.
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

public class ÜslüSayi {
    public static void main(String[] args) {
        int n, r, result = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the number: ");
        n = scan.nextInt();
        System.out.println("Which power of the previos number: ");
        r = scan.nextInt();

        for (int i = 1; i <= r ; i++) {
            result *= n;
        }

        System.out.println("The " + r + "th power of " + n + " is: " + result);
    }
}
