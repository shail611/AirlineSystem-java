package AirlineSystem;

import java.util.Random;
import java.util.Scanner;

public class particular
{
    Scanner sc = new Scanner(System.in);
    particular()
    {

    }
    void run(String planeName,String from,String to,String taarik,int count)
    {
        System.out.println("Timings available");
        Random random = new Random();
        int t,i;
        String time = "";
        int n = random.nextInt(1000);
        n = n%5;
        switch(n)
        {
            case 0:
                String time0[] = {"1:20 a.m.","6:00 a.m.","11:00 a.m.","3:00 p.m.","7:00 p.m.","9:30 p.m."};
                for( i=0;i< time0.length;i++)
                    System.out.println((i+1)+"."+time0[i]);
                System.out.println("Enter suitable timing number:");
                while(true)
                {
                    t = sc.nextInt();
                    if(t<i+1&&t>0)
                        break;
                    else
                        System.out.println("Enter again;");
                }
                System.out.println("Time selected is "+time0[t-1]);
                time = time0[t-1];
                break;
            case 1:
                String time1[] = {"2:20 a.m.","7:00 a.m.","12:05 p.m.","4:00 p.m.","8:00 p.m.","10:30 p.m."};
                for( i=0;i< time1.length;i++)
                    System.out.println((i+1)+"."+time1[i]);
                System.out.println("Enter suitable timing number:");
                while(true)
                {
                    t = sc.nextInt();
                    if(t<i+1&&t>0)
                        break;
                    else
                        System.out.println("Enter again;");
                }
                System.out.println("Time selected is "+time1[t-1]);
                time = time1[t-1];

                break;
            case 2:
                String time2[] = {"3:20 a.m.","8:00 a.m.","1:00 p.m.","5:00 p.m.","9:00 p.m.","11:30 p.m."};
                for( i=0;i< time2.length;i++)
                    System.out.println((i+1)+"."+time2[i]);
                System.out.println("Enter suitable timing number:");
                while(true)
                {
                    t = sc.nextInt();
                    if(t<i+1&&t>0)
                        break;
                    else
                        System.out.println("Enter again;");
                }
                System.out.println("Time selected is "+time2[t-1]);
                time = time2[t-1];

                break;
            case 3:
                String time3[] = {"4:20 a.m.","9:00 a.m.","2:00 p.m.","6:00 p.m.","10:00 p.m.","12:30 a.m."};
                for( i=0;i< time3.length;i++)
                    System.out.println((i+1)+"."+time3[i]);
                System.out.println("Enter suitable timing number:");
                while(true)
                {
                    t = sc.nextInt();
                    if(t<i+1&&t>0)
                        break;
                    else
                        System.out.println("Enter again;");
                }
                System.out.println("Time selected is "+time3[t-1]);
                time = time3[t-1];

                break;
            case 4:
                String time4[] = {"5:20 a.m.","10:00 a.m.","3:00 p.m.","7:00 p.m.","11:00 p.m.","1:30 a.m."};
                for( i=0;i< time4.length;i++)
                    System.out.println((i+1)+"."+time4[i]);
                System.out.println("Enter suitable timing number:");
                while(true)
                {
                    t = sc.nextInt();
                    if(t<i+1&&t>0)
                        break;
                    else
                        System.out.println("Enter again;");
                }
                System.out.println("Time selected is "+time4[t-1]);
                time = time4[t-1];

                break;
        }
        Booking book = new Booking(time,planeName,from,to,taarik,count);
    }
}
