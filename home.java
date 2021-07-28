package AirlineSystem;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class home
{
    Scanner sc = new Scanner(System.in);
    String name;
    home()
    {


    }
    void run(int count)
    {
        System.out.println("========================================");
        getName(count);
        System.out.println("\nWelcome "+name+" to the HOME PAGE\n");
        System.out.println("========================================");
        System.out.println("What would you like to do today?");
        while(true)
        {
            System.out.println("\n1.Look for Flight tickets\n2.View previous Booking\n3.View my profile\n99.Logout\n");
            int n = sc.nextInt();

            switch (n)
            {
                case 1:flights flight = new flights();flight.run(count);break;
                case 2:view view = new view();view.run(count);break;
                case 3:profile pro = new profile();pro.run(count);break;
                case 99:start start = new start();start.run();break;
                default:System.out.println("Invalid ID");
            }

        }
    }
    void getName(int count)
    {
        File file = new File("LoginCredentials.txt");
        try
        {
            Scanner reader = new Scanner(file);
            for(int i=0;i<count-6;i++)
            {
                reader.nextLine();
            }
            name = reader.nextLine();
        }
        catch(IOException e)
        {
            System.out.println("Error in Name");
        }
    }
}
