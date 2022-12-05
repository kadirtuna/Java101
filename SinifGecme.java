/**
 * Title: SinifGecme Application
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

public class SinifGecme {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, dersSayisi;
        dersSayisi = 5;

        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        matematik = scan.nextInt();
        if (matematik < 0 || matematik > 100) {
            matematik = 0;
            dersSayisi--;
        }

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            dersSayisi--;
        }

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = scan.nextInt();
        if (turkce < 0 || turkce > 100){
            turkce = 0;
            dersSayisi--;
        }

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();
        if (kimya < 0 || kimya > 100){
            kimya = 0;
            dersSayisi--;
        }

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = scan.nextInt();
        if (muzik < 0 || muzik > 100){
            muzik = 0;
            dersSayisi--;
        }


        float ortalama = (float)(matematik + fizik + turkce + kimya + muzik) / dersSayisi;

        System.out.println("Ortalamanız: " + ortalama);

        if (ortalama >= 55)
            System.out.println("Sınıfı geçtiniz!");
        else
            System.out.println("Malesef sınıfta kaldınız!");

    }
}
