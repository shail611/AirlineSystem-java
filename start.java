package AirlineSystem;

import java.util.Scanner;

 class start
{

    void run()
    {
        System.out.println("=============================================================");

        System.out.println("                        Welcome to LOGIN                     ");
        System.out.println("=============================================================");
        System.out.print("Enter 1 to login or 2 to create new Account or 3 to exit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1)
        {
            login login = new login();
            login.run(1);
        }
        else if(n==2)
        {
            info info = new info();
            info.run();
        }
        else if(n==3)
            System.exit(0);
    }
}
