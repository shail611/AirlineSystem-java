package AirlineSystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Booking extends profile
{
    int passengerCount = 1;
    Booking(String time,String planeName,String from,String to,String taarik,int count)
    {
        addP add = new addP();
        System.out.println("=============================================================");
        System.out.println("Flight Details:\n");
        System.out.println("From: "+from+"\nTo: "+to+"\nDate: "+taarik+"\nTime: "+time+"\nFlight Name: "+planeName);
        profile pro = new profile();
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
            System.out.println("\nName: " + name);
            System.out.println("age: " + age);
            System.out.println("Ph.no: " + pno);
        }
        catch (IOException e)
        {
            System.out.println("Error in profile");
        }
        String fileName = username+"Passenger.txt";
        try
        {
            FileWriter writer = new FileWriter(fileName);
            writer.write(from+"\n"+to+"\n"+taarik+"\n"+time+"\n"+planeName+"\n"+name+"\n"+age+"\n"+pno+"\n");
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
        while(true)
        {
            System.out.println("\n1.Add another passenger\n2.Pay and Book tickets");
            int n = sc.nextInt();
            if(n!=1&&n!=2)
                System.out.println("Please enter valid number");
            if(n==1)
            {
                add.run(username,count);
                passengerCount++;
            }
            if(n==2)
            {
                view v = new view();
                v.getPassengerCount(passengerCount);
                payment();
                return;
            }

        }

    }
    void payment()
    {
        int money,sum = 0;
        System.out.println("Number of Passengers for flight : "+passengerCount);
        Random random = new Random();
        for(int i=0;i<250;i++)
        {
            money = random.nextInt(100);

            sum = sum +money;
        }
        money = sum*passengerCount;
        System.out.println("Price for 1 Ticket is Rupees "+sum+"\n"+"Total Payment for economic class is Rupees "+money);
        System.out.println("\n\nAye! Why not add Rupees "+(sum/3)+" and upgrade to Business class? Very few passengers get this exclusive offer.\n" +
                "Enter 1 to upgrade or 0 to finish payment");
        int greed = sc.nextInt();
        if(greed==1)
        {
            System.out.println("\nPrice for 1 Ticket is Rupees "+(sum+sum/3)+"\n"+"Total Payment for Business class is Rupees "+(passengerCount*(sum+sum/3)));
            System.out.println("loading....loading....loading....\nPayment complete\nTickets Booked");
            System.out.println("You can now see your booked tickets in View Tickets Option");
            System.out.println("Sending back to Home Page");
        }
        else
        {
            System.out.println("loading....loading....loading....\nPayment complete\nTickets Booked");
            System.out.println("You can now see your booked tickets in View Tickets Option");
            System.out.println("Sending back to Home Page");
        }
    }
}
