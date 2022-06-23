
package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password, newPassword, reset;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Kullanýcý Adýný Giriniz: ");
        userName = scanner.nextLine();

        System.out.print("Lütfen Parolanýzý Giriniz ");
        password = scanner.nextLine();


        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Baþarýlý bir Giriþ Yaptýnýz...");
        } else if (!(userName.equals("patika") && password.equalsIgnoreCase("java123"))) {
            System.out.println("Kullanýcý adý veya þifreniz hatalý !!!");
            System.out.print("Þifrenizi sýfýrlamak istermisiniz ? (Evet/Hayýr):");
            reset = scanner.nextLine();
            if (reset.equals("Hayýr")) {
                System.out.println("Lütfen tekrar giriþ yapmak için sayfayý yenileyiniz.");
            } else if (reset.equals("Evet")) {
                System.out.print("Yeni þifre giriniz ");
                newPassword = scanner.nextLine();

                while (newPassword.equals("1234") || newPassword.equals(password)) {
                    System.out.print("Þifreniz oluþturulamadý. Farklý bir þifre ile tekrar deneyin: ");
                    newPassword = scanner.nextLine();
                    System.out.print("Þifreniz baþarýyla oluþturuldu.\nYeniden Giriþ yapabilirsiniz.\nKullanýcý Adýnýz: ");
                    userName = scanner.nextLine();
                    System.out.print("Þifreniz: ");
                    password = scanner.nextLine();

                    if (userName.equals("patika") && password.equals(newPassword)) {
                        System.out.print("Baþarýyla giriþ yaptýnýz.");
                    } else {
                        System.out.println("Kullanýcý adýnýz veya þifreniz hatalý.");


                    }
                }

            }
        }
    }
}
