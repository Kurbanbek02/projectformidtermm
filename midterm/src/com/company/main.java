package com.company;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println ("Write your day, month and year of birth: into column");
        Scanner dr = new Scanner(System.in);
        int d = dr.nextInt();
        Scanner mr = new Scanner(System.in);
        int m = mr.nextInt();
        Scanner gr = new Scanner(System.in);
        int g = gr.nextInt();
        { System.out.print("Your date of birth is ");
            String[] array ={"January","Febrary","March","April","May","June",
                    "July","August","September","October","November","December"};
            System.out.println(array[m-1] + " " +d+ ", " +g);
        }
        int v= 2021-g;
        System.out.println("You are " +v+ " years old");
        int j= g % 12;
        String[] array = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox",
                "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat"};
        System.out.println("Your horoscope according to the 'Solar calendar': " + array[j]);
        String [] arrZodiak = {"Ram", "Bull", "Twins", "Crab", "Lion", "Maiden",
                "Scales", "	Scorpion", "Archer", "Sea-Goat", "Water-Bearer", "Fishes"};
        System.out.print("Your horoscope according to the 'Moon calendar': ");
        if ( (m == 3 && d > 21) || (m == 4 && d <= 20) )
            System.out.print ( arrZodiak[0]);
        else
        if ( (m == 4 && d > 21) || (m == 5 && d <= 20) )
            System.out.print ( arrZodiak[1]);
        else
        if ( (m == 5 && d > 21) || (m == 6 && d <= 21) )
            System.out.print ( arrZodiak[2]);
        else
        if ( (m == 6 && d > 22) || (m == 7 && d <= 22) )
            System.out.print ( arrZodiak[3]);
        else
        if ( (m == 7 && d > 23) || (m == 8 && d <= 23) )
            System.out.print ( arrZodiak[4]);
        else
        if ( (m == 8 && d > 24) || (m == 9 && d <= 23) )
            System.out.print ( arrZodiak[5]);
        else
        if ( (m == 9 && d > 24) || (m == 10 && d <= 22) )
            System.out.print ( arrZodiak[6]);
        else
        if ( (m == 10 && d > 23) || (m == 11 && d<= 22) )
            System.out.print ( arrZodiak[7]);
        else
        if ( (m == 11 && d > 23) || (m == 12 && d <= 21) )
            System.out.print( arrZodiak[8]);
        else
        if ( (m == 12 && d > 22) || (m == 1 && d <= 20) )
            System.out.print ( arrZodiak[9]);
        else
        if ( (m == 1 && d > 21) || (m == 2 && d <= 19) )
            System.out.print( arrZodiak[10]);
        else
        if ( (m == 2 && d > 20) || (m == 3 && d <= 20) )
            System.out.print ( arrZodiak[11]);
    }
}
