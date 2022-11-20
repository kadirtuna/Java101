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

public class CircleInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the radius of the circle: ");
        float radius = scan.nextFloat();
        System.out.println("Type the angle of the piece: ");
        float angle = scan.nextFloat();
        float pi = 3.14f;
        double area = (pi * (radius * radius) * angle) / 360;
        System.out.println("The area of the piece is: " + area);
    }
}
