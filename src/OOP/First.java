package OOP;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
       Doctors doctor1 = new Doctors();
       doctor1.Name ="ahmed" ;
       doctor1.Id = 1 ;
       doctor1.Subject = "Compiler" ;
       doctor1.salary = 500000;



       String Name = "Aya" ;
       Doctors doctor2 = new Doctors();
        doctor2.Name ="ibrahim" ;
        doctor2.Id = 2 ;
        doctor2.Subject = "Data mining" ;
        doctor2.salary = 600000;


        System.out.println(doctor1.Name);
        System.out.println(Name);
        doctor1.Explain(doctor1.Name);
      //  doctor2.Explain();
    }

}
