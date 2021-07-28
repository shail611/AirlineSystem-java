package AirlineSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class view extends profile
{
    String from,to,taarik,time,planeName;
    int passengerCount;

    void run(int count)  {
        File file = new File("LoginCredentials.txt");

        try
        {
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

        }
        catch (IOException e)
        {
            System.out.println("Error in profile");
        }
        String fileName = username+"Passenger.txt";
        file = new File(fileName);

        if(file.exists())
        {
            getBookingInfo(file,count);
        }
        else
        {
            System.out.println("No previous booking recorded");
        }
    }
    void getPassengerCount(int c)
    {
         passengerCount = c;
    }
    int setPassengerCount()
    {
        System.out.println(passengerCount);
        return passengerCount;
    }
    void getBookingInfo(File file,int count)
    {
        try
        {
            Scanner reader = new Scanner(file);
            //while(reader.hasNextLine())
            {
                System.out.println("=============================================================");

                from = reader.nextLine();
                to = reader.nextLine();
                taarik = reader.nextLine();
                time = reader.nextLine();
                planeName = reader.nextLine();
                System.out.println("\nFrom: "+from+"\nTo: "+to+"\nDate: "+taarik+"\nTime: "+time+"\n"+"Flight taken: "+planeName+"\n");
                System.out.println("Passenger Details:");
                while(reader.hasNextLine())
                {
                    for(int i=0;i<passengerCount+1;i++)
                    {

                        name = reader.nextLine();
                        String age = reader.nextLine();
                        pno = reader.nextLine();
                        //pno = reader.nextLine();
                        System.out.println("\nName: "+name+"\nAge: "+age+"\nPh.no: "+pno);
                    }
                }
                System.out.println("\n\nDo write us about your journey at- \n19BCE232@nirmauni.ac.in\n19BCE294@nirmauni.ac.in\n19BCE231@nirmauni.ac.in");

                System.out.println("=============================================================");

            }

        }
            catch (IOException e)
            {
                System.out.println("Error in getting old booking");
            }


    }
}
