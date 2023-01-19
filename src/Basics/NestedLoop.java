package Basics;

public class NestedLoop { //pascal


    public static void main(String[] args) {
       //Nested Loops : Need it if we will iterate in more than one thing
        //Ex> Print all days in weeks per month
        //So will need 2 loops > 1 for weeks and 1 for days

        for (int i = 1 ; i <= 4 ; i++) //Weeks
        {
            for (int j = 1 ; j <= 7 ; j++) //Days
            {
                System.out.println("Week: " + i + " Day: " + j);
            }
        }
        //try to do this example with adding year :)
        }

    }



