import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        int distance, travelType, age;
        double pricePerKm, totalPrice;

        Scanner scan = new Scanner(System.in);
        pricePerKm = 0.10;
        System.out.println("Type the distance of the target place: ");
        distance = scan.nextInt();

        if (distance < 0){
            System.out.println("The application has been closed due to wrong distance number! Try again.");
            System.exit(0);
        }

        System.out.println("\n1-One way\n2-Return\nType the travel type number: ");
        travelType = scan.nextInt();

        if(!(travelType == 1 || travelType == 2)){
            System.out.println("The application has been closed due to wrong travel type number! Try again.");
            System.exit(0);
        }

        totalPrice = distance * pricePerKm * travelType;

        //The discount starts with this line.
        System.out.println("Type your age: ");
        age = scan.nextInt();

        if (age < 0){
            System.out.println("The application has been closed due to invalid age input! Try again.");
            System.exit(0);
        }
        else if(age < 12)
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
