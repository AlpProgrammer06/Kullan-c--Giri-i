
package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password, newPassword, reset;

        Scanner scanner = new Scanner(System.in);

        System.out.print("L�tfen Kullan�c� Ad�n� Giriniz: ");
        userName = scanner.nextLine();

        System.out.print("L�tfen Parolan�z� Giriniz ");
        password = scanner.nextLine();


        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Ba�ar�l� bir Giri� Yapt�n�z...");
        } else if (!(userName.equals("patika") && password.equalsIgnoreCase("java123"))) {
            System.out.println("Kullan�c� ad� veya �ifreniz hatal� !!!");
            System.out.print("�ifrenizi s�f�rlamak istermisiniz ? (Evet/Hay�r):");
            reset = scanner.nextLine();
            if (reset.equals("Hay�r")) {
                System.out.println("L�tfen tekrar giri� yapmak i�in sayfay� yenileyiniz.");
            } else if (reset.equals("Evet")) {
                System.out.print("Yeni �ifre giriniz ");
                newPassword = scanner.nextLine();

                while (newPassword.equals("1234") || newPassword.equals(password)) {
                    System.out.print("�ifreniz olu�turulamad�. Farkl� bir �ifre ile tekrar deneyin: ");
                    newPassword = scanner.nextLine();
                    System.out.print("�ifreniz ba�ar�yla olu�turuldu.\nYeniden Giri� yapabilirsiniz.\nKullan�c� Ad�n�z: ");
                    userName = scanner.nextLine();
                    System.out.print("�ifreniz: ");
                    password = scanner.nextLine();

                    if (userName.equals("patika") && password.equals(newPassword)) {
                        System.out.print("Ba�ar�yla giri� yapt�n�z.");
                    } else {
                        System.out.println("Kullan�c� ad�n�z veya �ifreniz hatal�.");


                    }
                }

            }
        }
    }
}
