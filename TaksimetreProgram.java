/**
 * Title: TaksimetreProgram Application
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

public class TaksimetreProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz: ");
        float distance = scan.nextFloat();
        float taxiKmPrice = 2.2f;
        float fee = 10 + distance * taxiKmPrice;

        fee = (fee < 20) ? 20: fee;
        System.out.println("Taksimetre Tutarı: " + fee);
    }
}
