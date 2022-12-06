/**
 * Title: ArtikYil Application
 * Author: Kadir Tuna
 * Description: ArtikYil App calculates that input year is whether a leap year or not.
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

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Boolean isLeapYear = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("Type the year to learn it's a leap year or not: ");
        year = scan.nextInt();

        if (year % 4 == 0)
            isLeapYear = true;
        if (year % 100 == 0)
            isLeapYear = false;
        if (year % 400 == 0)
            isLeapYear = true;


        System.out.println("The year " + year + " is " + (isLeapYear == false ? "not a leap year" : "a leap year"));
    }
}

