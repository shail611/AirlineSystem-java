package AirlineSystem;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class flights
{
    Scanner sc = new Scanner(System.in);
    String from,to,taarik,day,month,year;
    flights()
    {

    }
    void run(int count)
    {
        System.out.println("========================================");
        System.out.println("\nWelcome to Flights Booking");
        System.out.println("Enter city of Depature: ");
        from = sc.nextLine();
        System.out.println("Enter city to reach: ");
        to = sc.nextLine();
        System.out.println("All tickets to "+to+" are cancelled due to COVID-19 in 2020. Please look tickets for 2021 or ahead");
        System.out.println("Enter date(dd/mm/yyyy): ");
        taarik = sc.nextLine();
        String[] DATE=taarik.split("/");
        while(true)
        {
            if(DATE.length!=3)
            {
                System.out.println("Wrong format");
                System.out.println("Enter date(dd/mm/yyyy): ");
                taarik = sc.nextLine();
                DATE=taarik.split("/");
            }
            else break;
        }

        boolean b = checkDate(DATE[0],DATE[1],DATE[2]);
        while(true)
        {
            if(!b)
            {
                System.out.println("Either wrong Date or date in past.");
                System.out.println("Enter date(dd/mm/yyyy): ");
                taarik = sc.nextLine();
                DATE=taarik.split("/");

                while(true)
                {
                    if(DATE.length!=3)
                    {
                        System.out.println("Wrong format");
                        System.out.println("Enter date(dd/mm/yyyy): ");
                        taarik = sc.nextLine();
                        DATE=taarik.split("/");
                    }
                    else break;
                }
                b = checkDate(DATE[0],DATE[1],DATE[2]);
            }
            else
                break;
        }

        System.out.println("\nAll available flights on "+taarik+"\n");
        show(count);
    }

    boolean checkDate(String day,String month,String year)
    {
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);
        if((d>0&&d<32)&&(m>0&&m<13)&&y>=2021)
        {
            return true;
        }
        return false;
    }
    void show(int count)
    {
        String planes[] = {"Air India","IndiGo","Kingfisher","Arab Emirats","Lufthansa","Indian Airlines","Qatar Airways","GoAir","SpiceJet","JetAirways","Qantas","Singapore Airlines"};
        Random random = new Random();
        int n = random.nextInt(1000);
        int i,fl;
        int n1[] = new int[planes.length];
        System.out.println("Available are:");
        for(i=0;i<n% planes.length+1;i++)
        {
            n1[i] = random.nextInt(1000)% planes.length;
            System.out.println((i+1)+"."+planes[n1[i]]);

        }
        System.out.println("Enter the flight to take");
        System.out.println("========================================");
        System.out.println("Or enter 0 to refresh and 99 to exit");
        System.out.println("========================================");
        while(true)
        {
            fl = sc.nextInt();
            if(fl<i+1&&fl>0)
                break;
            else if(fl==0)
            {
                show(count);
                return;
            }
            else if(fl==99)
                return;
            else
                System.out.println("Wrong number. Enter again:");
        }
        System.out.println("Welcome to "+planes[n1[fl-1]]+"'s booking Page\n\n\n");
        if(planes[n1[fl - 1]].equals(planes[0]))
        {
                AirIndia airIndia = new AirIndia();
        }
        else if(planes[n1[fl - 1]].equals(planes[1]))
        {
            Indigo indigo = new Indigo();
        }
        else if(planes[n1[fl - 1]].equals(planes[2]))
        {
            Kingfisher kingfisher = new Kingfisher();
        }
        else if(planes[n1[fl - 1]].equals(planes[3]))
        {
            ArabEmirates arabEmirates = new ArabEmirates();
        }
        else if(planes[n1[fl - 1]].equals(planes[4]))
        {
            Lufthansa lufthansa = new Lufthansa();
        }
        else if(planes[n1[fl - 1]].equals(planes[5]))
        {
            Indianairlines indianairlines = new Indianairlines();
        }
        else if(planes[n1[fl - 1]].equals(planes[6]))
        {
            Qatar qatar = new Qatar();
        }
        else if(planes[n1[fl - 1]].equals(planes[7]))
        {
            GoAir goAir = new GoAir();
        }
        else if(planes[n1[fl - 1]].equals(planes[8]))
        {
            Spicejet spicejet = new Spicejet();
        }
        else if(planes[n1[fl - 1]].equals(planes[9]))
        {
            Jet jet = new Jet();
        }
        else if(planes[n1[fl - 1]].equals(planes[10]))
        {
            Qantas qantas = new Qantas();
        }
        else if(planes[n1[fl - 1]].equals(planes[11]))
        {
            Singa singa = new Singa();
        }
        System.out.println("\n\n\nWelcome here for booking "+planes[n1[fl-1]]);
        particular par = new particular();
        par.run(planes[n1[fl-1]],from,to,taarik,count);
    }



}
