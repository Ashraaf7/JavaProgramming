package OOP.Inheritance;

public class MainForStatic {
    public static void main(String[] args) {
        //Count without Static variable count
        Doctors d1 = new Doctors();
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
        System.out.println(Doctors.count);

        //Count Using Static variable count

/*        Students s1 = new Students("Ahmed" , 1 , "CS");
        Students s2 = new Students("moahed" , 1, "CS");
        Students s3 = new Students("sara" , 3 , "CS");
        Students s4 = new Students("mahmoud" , 4 , "CS");
        Students s5= new Students("mahmoud" , 4 );//New
        Students s6= new Students( );//New
        System.out.println(Students.count);*/
    }
}
