package Basics;

public class SwitchCondition { //pascal


    public static void main(String[] args) {
        int age = 17 ;
        switch (age)
        {
            case 18 :
                System.out.println("18");
                break; // To prevent continue if condition done
            case 25 :
                System.out.println("25");
                break; // To prevent continue if condition done
            default: //as else in if
                System.out.println("Don't Know");
                //break ; ?? Does not matter because it is final statement
        }
        }

    }



