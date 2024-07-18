/***********************************
Caravana, Ana Maricris A.
BSCpE 1-1

IV - Programming Exercise
    Java
    2.  Distance Traveled
**********************************/

import java.util.Scanner;

public class JavaDistanceTraveled 
{
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        int speed; 
        int time;

        System.out.println ("Hello!");
        System.out.println("This program calcuates the Distance Traveled");
        System.out.println(" ");

        System.out.println(" ");
        System.out.print("If you want to continue");
        System.out.println(" ");
        System.out.print("Please enter the speed of the vehicle in miles per hour (MPH): ");
        speed = dt.nextInt();

        System.out.print("If you want to continue");
        System.out.println(" ");
        System.out.print("Please enter the traveled hours: ");
        time = dt.nextInt();
        System.out.println(" ");
        
        CalculateDistanceTraveled(speed, time);
    }

    private static void CalculateDistanceTraveled(int speed, int time) 
    {
        System.out.println("Hour\t\tDistance Traveled");
        System.out.println("----            -----------------");
        for (int hours = 0; hours < time; hours++)  
        {
            int distance = speed * (hours + 1);
            System.out.println((String.valueOf(hours + 1) + "\t\t" + String.valueOf(distance)));
        }
    }
}
