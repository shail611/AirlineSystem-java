package AirlineSystem;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class profile {
    String name, sex, username, pass, pno;
    int age,c;
    Scanner sc = new Scanner(System.in);
    profile() {

    }

    void run(int count) {
        File file = new File("LoginCredentials.txt");

        try {
            Scanner reader = new Scanner(file);
            for (int i = 0; i < count - 6; i++) {
                reader.nextLine();
            }
            name = reader.nextLine();
            age = reader.nextInt();
            sex = reader.nextLine();
            sex = reader.nextLine();
            pno = reader.nextLine();
            username = reader.nextLine();
            pass = reader.nextLine();
            System.out.println("********************************************");
            System.out.println("Name: " + name);
            System.out.println("age: " + age);
            System.out.println("Sex: " + sex);
            System.out.println("Ph.no: " + pno);
            System.out.println("Username: " + username);
            System.out.println("Password: " + pass);
            System.out.println("********************************************");

        } catch (IOException e)
        {
            System.out.println("Error in profile");
        }
    }



}