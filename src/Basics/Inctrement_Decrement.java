package Basics;

public class Inctrement_Decrement { //pascal


    public static void main(String[] args) {
        /*
        Increment is used to increase the value by one
        Decrement is used to decrease the value by one
         */
        int x = 5 ;
        int y = 10 ;
        x++ ; // x = x + 1 ;
        x-- ; // x = x - 1 ;
        //Prefix
        ++x ;
        //Postfix
        x++ ;
        //Note : Prefix and postfix have shown in printing
        System.out.println(x++); //Print x then increment them 1 for next time
        System.out.println(++y);//Increment y then print it
        //Assignment Operator
        x += 5 ;  // x = x + 5 ;  //Same as all operations

        }

    }



