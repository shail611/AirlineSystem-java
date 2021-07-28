package AirlineSystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class addP
{
    Scanner sc = new Scanner(System.in);
    String name,pno;
    int age;
    addP()
    {

    }
    void run(String username,int count)
    {
        String fileName = username+"Passenger.txt";
        System.out.println("Enter Name of new Passenger:");
        name = sc.nextLine();
        System.out.println("Enter age of new Passenger:");
        age = sc.nextInt();
        System.out.println("Enter Ph.no of new Passenger:");
        pno = sc.nextLine();
        pno = sc.nextLine();
        File file = new File(fileName);
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
            writer.write(name+"\n"+age+"\n"+pno+"\n");
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
    }
}

