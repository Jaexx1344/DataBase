package BazaDanych;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    private String name;
    private String password;

    public void menu(){
        System.out.println("Witaj, co chciałbyś zrobić? : ");


        System.out.println("1 - Nazwa : ");
        System.out.println("2 - Hasło : ");
        name = scanner.nextLine();
        password = scanner.nextLine();

        User user = new User(name,password);

        DataBase dataBase = new DataBase(user);
        dataBase.zapytanie();
    }
}
