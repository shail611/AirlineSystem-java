package AirlineSystem;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;


public class info
{
    String name,sex,username,pass,con,pno;
    int age;
    Scanner sc = new Scanner(System.in);
    info()
    {

    }
    void run()
    {
        System.out.println("========================================");
        System.out.println("Creating new Account");
        System.out.print("Full Name:");
        name = sc.nextLine();
        System.out.print("Age:");
        age = sc.nextInt();
        System.out.print("Sex(M/F):");
        sex = sc.nextLine();
        sex = sc.nextLine();
        System.out.print("Ph.no:");
        pno = sc.nextLine();
        boolean b = true;
        while (b)
        {
            System.out.print("Username:");
            username = sc.nextLine();
            b = checkUser(username);
        }

        while(true)
        {
            System.out.print("Password( min 4 characters):");
            pass = sc.nextLine();
            System.out.print("Confirm Pass:");
            con = sc.nextLine();
            if(pass.equals(con))
                break;
            else
                System.out.println("Password didn't match. Try again");
        }

        File file = new File("LoginCredentials.txt");
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter("LoginCredentials.txt",true));
            writer.write(name+"\n"+age+"\n"+sex+"\n"+pno+"\n"+username+"\n"+pass+"\n");
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
        start start = new start();
        start.run();
    }
    boolean checkUser(String user)
    {
        int u = 1;
        File file = new File("LoginCredentials.txt");
        try
        {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine())
            {
                if(u%6!=5)
                {
                    u++;
                    reader.nextLine();
                    continue;
                }
                String tempUser = reader.nextLine();
                if(tempUser.equals(user))
                {
                    System.out.println("This username is already taken. Choose a different username");
                    return true;
                }
                u++;
            }
        }
        catch (IOException e)
        {
            System.out.println("Error");
        }
        return false;
    }
}
