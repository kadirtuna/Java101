/**
 * Title: ManavKasap Application
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

public class HipotenüsHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Üçgenin bir dik kenar uzunluğunu giriniz: ");
        float x = scan.nextFloat();
        System.out.println("Üçgenin diğer dik kenar uzunluğunu giriniz: ");
        float y = scan.nextFloat();
        float hipotenus = (float)Math.sqrt(x * x + y * y);
        System.out.println("Bu üçgenin hipotenüs kenar uzunluğu: " + hipotenus);
        float area =  (x * y) / 2;
        System.out.println("Üçgenin alanı ise: " + area);
    }
}
