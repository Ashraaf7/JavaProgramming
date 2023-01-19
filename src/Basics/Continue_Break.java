package Basics;

import java.util.Scanner;

public class Continue_Break {

    public static void main(String[] args) {
        int sum = 0 , num;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i<=5 ; i++)
        {
            System.out.println("Enter Number" + i);
            num = input.nextInt();
            if(num <0)
            {
                System.out.println("Negative Not allowed");
                continue; //continue remaining iterations
                //break ; //Prevent remaining iterations
            }
            sum =  sum+num ;
        }
        System.out.println(sum);






    }


}
