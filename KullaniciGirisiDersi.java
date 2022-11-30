import java.io.IOException;
import java.util.Scanner;

public class KullaniciGirisiDersi {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String username = "admin";
        String password = "password";
        Boolean control1 = true;

        while(control1) {

        System.out.println("\nKullanıcı adını giriniz: ");
        String inputUsername = scan.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        String inputPassword = scan.nextLine();

            if (!inputUsername.equals(username))
                System.out.println("You typed wrong username!");
            else if (!inputPassword.equals(password)) {
                System.out.println("You typed wrong password!\nWould you like to reset your password? If yes, type \"yes\"");
                String request = scan.nextLine();
                if(request.equals("yes")) {
                    Boolean control2 = true;

                    while(control2){
                        System.out.println("Type the new password: ");
                        String newPassword = scan.nextLine();

                        if(newPassword.equals(inputPassword) || newPassword.equals(password))
                            System.out.println("Your password can't be same with your old password and your last typed wrong password!");
                        else {
                            password = newPassword;
                            control2 = false;
                        }
                    }
                }
            }
            else{
                System.out.println("Başarıyla giriş yaptınız!");
                control1 = false;
            }
        }
        System.out.println("You are now in the program!");

    }
}
