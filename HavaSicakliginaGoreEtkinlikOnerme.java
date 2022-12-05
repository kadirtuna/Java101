/**
 * Title: HavaSicakliginaGöreEtkinlikOnerme Application
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

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int celcius;

        Scanner scan = new Scanner(System.in);
        System.out.println("Hava sıcaklığına göre etkinlik önerisi için hava sıcaklığı derecesini giriniz: ");
        celcius = scan.nextInt();

        if (celcius < 5)
            System.out.println("Kayak yapabilirsin!");
        else if (celcius >= 5 && celcius < 15)
            System.out.println("Sinemaya gidebilirsin!");
        else if (celcius >= 15 && celcius < 25)
            System.out.println("Piknik yapmaya gidebilirsin!");
        else
            System.out.println("Yüzmeye gidebilirsin!");
    }
}
