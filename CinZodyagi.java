/**
 * Title: CinZodyagi Application
 * Author: Kadir Tuna
 * Description:The program takes the user's birth year and calculates Chinese Zodiac based on the remainder of that divided by 12.
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

public class CinZodyagi {
    public static void main(String[] args) {
        int year;
        String horoscope = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Type the year of your date of birth: ");
        year = scan.nextInt();

        switch(year % 12){
            case 0:
                horoscope = "Maymun";
                break;
            case 1:
                horoscope = "Horoz";
                break;
            case 2:
                horoscope = "Köpek";
                break;
            case 3:
                horoscope = "Domuz";
                break;
            case 4:
                horoscope = "Fare";
                break;
            case 5:
                horoscope = "Öküz";
                break;
            case 6:
                horoscope = "Kaplan";
                break;
            case 7:
                horoscope = "Tavşan";
                break;
            case 8:
                horoscope = "Ejderha";
                break;
            case 9:
                horoscope = "Yılan";
                break;
            case 10:
                horoscope = "At";
                break;
            case 11:
                horoscope = "Koyun";
                break;
        }

        System.out.println("Your horoscope is: " + horoscope);
    }
}
