/**
 * Title: UcakBiletiFiyatHesaplama Application
 * Author: Kadir Tuna
 * Description: This application is for calculating the total flight price that depends of the distance, travel type and the age.
 * The discount is applied with the rate of the user's age.
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

public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        int distance, travelType, age;
        double pricePerKm, totalPrice;

        Scanner scan = new Scanner(System.in);
        pricePerKm = 0.10;
        System.out.println("Type the distance of the target place: ");
        distance = scan.nextInt();
        System.out.println("\n1-One way\n2-Return\nType the travel type number: ");
        travelType = scan.nextInt();
        System.out.println("Type your age: ");
        age = scan.nextInt();

        if (distance < 0 || !(travelType == 1 || travelType == 2) || age < 0){
            System.out.println("The application has been closed due to wrong data! Try again.");
            System.exit(0);
        }

        totalPrice = distance * pricePerKm * travelType;

        if(age < 12) //The discount calculation starts with this line.
            totalPrice = totalPrice * 0.5;
        else if (age < 24)
            totalPrice = totalPrice * 0.9;
        else if (age > 65)
            totalPrice = totalPrice * 0.7;

        if (travelType == 2)
            totalPrice = totalPrice * 0.8;

        System.out.println("Your Total Flight Price: " + totalPrice);
    }
}
