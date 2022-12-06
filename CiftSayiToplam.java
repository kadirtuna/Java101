/**
 * Title: CiftSayiToplam Application
 * Author: Kadir Tuna
 * Description: This program outputs all even numbers from zero to given number.
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

public class CiftSayiToplam {
    public static void main(String[] args) {
        int number;

        Scanner scan = new Scanner(System.in);

        System.out.println("Type the number to print all even numbers from 0 to your given number: ");
        number = scan.nextInt();

        for (int i = 0; i < number; i += 2) {
            System.out.println(i);
        }
    }
}
