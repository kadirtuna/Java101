import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        ArrayList<Integer> notlar = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        matematik = scan.nextInt();
        notlar.add(matematik);

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();
        notlar.add(fizik);

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = scan.nextInt();
        notlar.add(turkce);

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();
        notlar.add(kimya);

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = scan.nextInt();
        notlar.add(muzik);

        int notSayisi = 0;
        int sum = 0;
        for (int not: notlar) {
            if (!(not > 100 || not < 0)) {
                notSayisi++;
                sum += not;
            }
            else{
                System.out.println("Notunuz geçersiz aralıkta olduğundan ortalamanıza etki etmeyecektir!");
            }
        }

        System.out.println("Ortalamanız: " + ((float)sum / notSayisi));
    }
}
