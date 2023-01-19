package Basics;

public class Variables_DataTypes { //pascal


    public static void main(String[] args) {

        int x ; //Integers values {1,2,3,4,5,...}
        double y ; //Floated values {1.1,2.5,3.2,4.3,5.6,...} //Size > Float
        float z ; //Floated values {1.1,2.5,3.2,4.3,5.6,...}
        char c ; //Only One Character = 'A' , 'B'
        String s ; //More than one character "Ahmed" , "Mohamed"
        boolean bool ; //True or False only
        /*
        Write a program which creates three variables: student
        name, graduation year, & letter grade. Then print the
        three values.
         */
        String studentName = "Ahmed" ;
        int graduationYear = 2020 ;
        String letterGrade = "A" ;
        //Concatenation >> String + String + String
        System.out.println(studentName + " " + graduationYear + " " + letterGrade);


        }

    }



