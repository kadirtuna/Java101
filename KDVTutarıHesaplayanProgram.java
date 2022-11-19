/**
 * Title: ManavKasap Application
 * Author: Kadir Tuna
 * Assignment: Java101-Patika.Dev
 * Description: This project is for computing the KDV tax and printing out the amount, the amount with KDV tax and KDV tax on the console.
 *
 * Contacts;
 * Instagram: kadir.tuna
 * Github : github.com/kadirtuna
 * LinkedIn : linkedin.com/in/kadirtuna20
 *
 * by;
 * @author Kadir Tuna
 */

import java.util.Scanner;

public class KDVTutarıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tutarı giriniz: ");

        float amount = scan.nextFloat();
        float kdvAmount = (amount < 1000) ? 18: 8;

        System.out.println("KDV'siz tutar: " + amount);
        System.out.println("KDV'li tutar: " + (amount + ((amount * kdvAmount) / 100)));
        System.out.println("KDV Tutarı: " + ((amount * kdvAmount) / 100));

    }
}
