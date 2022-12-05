/**
 * Title: NotOrtalamasiHesaplayanProgram Application
 * Author: Kadir Tuna
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

public class NotOrtalamasıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        float math = scan.nextFloat();
        System.out.println("Fizik notunuzu giriniz: ");
        float physics = scan.nextFloat();
        System.out.println("Kimya notunuzu giriniz: ");
        float chemistry = scan.nextFloat();
        System.out.println("Türkçe notunuzu giriniz: ");
        float turkish = scan.nextFloat();
        System.out.println("Tarih notunuzu giriniz: ");
        float history = scan.nextFloat();
        System.out.println("Müzik notunuzu giriniz: ");
        float music = scan.nextFloat();
        float result = (math + physics + chemistry + turkish + history + music) / 6;
        System.out.println("Not ortalamanız: " + result);

        System.out.println((result >=60) ? "Sınıfı Geçti": "Sınıfta Kaldı");

    }
}
