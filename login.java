package AirlineSystem;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
class login
{
    int tries = 0;
    String username,password;
    Scanner sc = new Scanner(System.in);
    public int count = 1;
    login()
    {

    }
    void run(int tri)
    {
        tries = tri;
        System.out.println("=============================================================");
        System.out.print("\nUSERNAME: ");
        username = sc.nextLine();
        System.out.print("PASSWORD: ");
        password = sc.nextLine();
        check();
    }
    void check()
    {
        File file = new File("LoginCredentials.txt");
        if(!file.exists())
        {
            try
            {
                FileWriter writer = new FileWriter(file);
                writer.close();
            }
            catch (IOException e)
            {
                System.out.println("Error");
            }
        }
        int r=0;
        try
        {
            String data;
            Scanner reader = new Scanner(file);

            while(reader.hasNextLine())
            {
                if(count%6!=5)
                {
                    reader.nextLine();
                    count++;
                    continue;
                }
                if(username.equals(reader.nextLine()))
                {
                    if(password.equals(reader.nextLine()))
                    {
                        count++;
                        r=1;
                        welcome welcome = new welcome();
                        home home = new home();
                        home.run(count);
                        break;
                    }

                }
                else
                {
                    count++;
                }

            }
            if(r==0)
            {
                System.out.println("Incorrect username or password");
                //tries++;
                System.out.println("Attempts:"+tries);
                if(tries>2)
                {
                    System.out.println("Too many unsuccessful attempts.Create a new account");
                    start start = new start();
                    tries = 0;
                    start.run();return;
                }
                else
                {
                    login login = new login();
                    login.run(++tries);
                }

            }

        }
        catch(IOException e)
        {
            System.out.println("Error");
        }


    }

}
