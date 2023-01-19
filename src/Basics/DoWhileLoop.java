package Basics;

public class DoWhileLoop { //pascal


    public static void main(String[] args) {
       /*
      Do While Loop : as for and while BUT do at least one iteration even condition
      not satisfied
        */
        //Print numbers from 1 > 100
        int i = -1 ; //condition not satisfied but also will print it only one
        do
        {
            System.out.println(i);
            i++ ;  //Increment
        }
        while ( i <= 100 ); //Condition
        }

    }



