package OOP;

import PV.Doctors;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
      /* Doctors doctor1 = new Doctors();
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
      //  doctor2.Explain();*/



       /* Doctors d1 = new Doctors();
        d1.Countt();
        Doctors d2= new Doctors();
        d2.Countt();
        Doctors d3 = new Doctors();
        d3.Countt();
        Doctors d4 = new Doctors();
        d4.Countt();
        Doctors d5 = new Doctors();
        d5.Countt();
        Doctors d6= new Doctors();
        d5.Countt();
        System.out.println(Doctors.count);*/
/*        Students s1 = new Students("Ahmed" , 1 , "CS");
        Students s2 = new Students("moahed" , 1, "CS");
        Students s3 = new Students("sara" , 3 , "CS");
        Students s4 = new Students("mahmoud" , 4 , "CS");
        Students s5= new Students("mahmoud" , 4 );//New
        Students s6= new Students( );//New
        System.out.println(Students.count);
        Students.compare(s1 ,s2);
        Students.copy(s6 , s1);
        System.out.println(s6.Name);*/
        Doctors d = new Doctors();
        d.Name = "Ahmed";
        d.Explain(d.Name);
        d.Explain();

        Students s = new Students();
        s.Play();

    }

}
