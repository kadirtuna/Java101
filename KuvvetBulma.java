/**
 * Title: KuvvetBulma Application
 * Author: Kadir Tuna
 * Description: It prints out the 4th and 5th power of the number entered by the user to the console.
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

public class KuvvetBulma {
    public static void main(String[] args) {
        int number, i = 0;

        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        while(true){
            System.out.println("The 4th power of " + i + " is " + Math.pow(i, 4));
            System.out.println("The 5th power of " + i + " is " + Math.pow(i, 5));
            i++;
            if(i >= number)
                break;
        }
    }
}
