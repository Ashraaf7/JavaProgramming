package Basics;

public class IfConditions { //pascal


    public static void main(String[] args) {
        //Execute piece of based on condition
        int age = 20 ;
        String gender= "male" ;
        if (age > 18 )
            System.out.println("Adult");
        else if (age > 50) {
            System.out.println("Too Old");
        }
        else
            System.out.println("Underage");
        //Nested if
        if (age > 18 )
        {
            if(gender.equalsIgnoreCase("male"))
            {
                System.out.println("Adult");
            }
        }

        //Combining more than one condition
        if (age>18 && gender.equalsIgnoreCase("male"))
            System.out.println("Adult Male ");
        else if (age>18 || gender.equalsIgnoreCase("male")) {
            System.out.println("Adult");
        } else if (!gender.equalsIgnoreCase("male")) {
            System.out.println("Female");
        }

    }

    }



