/**
 * Title: TekSayiToplam Application
 * Author: Kadir Tuna
 * Description: TekSayiToplam app sum up the user's input all even numbers until the user inputs an odd number.
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

public class TekSayiToplam {
    public static void main(String[] args) {
        int tempNumber, total = 0;

        Scanner scan = new Scanner(System.in);

        while (true){
            tempNumber = scan.nextInt();
            if (tempNumber % 2 == 1){
                System.out.println("You typed an odd number.");
                break;
            }
                total += tempNumber; //The request was that the numbers that is divided by two and four, is added however if a number is divided by 2, that number is already divided by 4.So there is just a condition is that controlling the number is divisible by 2 or not.
        }

        System.out.println("All total even numbers for input values: " + total);
    }
}
