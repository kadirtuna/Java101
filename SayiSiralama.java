/**
 * Title: SayiSiralama Application
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
public class SayiSiralama {
    public static void main(String [] args){
        int a,b,c;

        Scanner input= new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        b=input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz:");
        c=input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        }else if ((b > a) && (b > c)) {
            if (c > a) {
                System.out.println("b > c > a");
            }else {
                System.out.println("b > a > c");
            }
        }else {
            if(a > b) {
                System.out.println("c > a > b");
            }else {
                System.out.println("c > b > a");
            }
        }
    }
}