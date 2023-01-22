package OOP.Inheritance;

public class Doctors extends ParentClass {
    //Attributes

    public int salary;


    //Methods
    public  void Explain (String Name)
    {
        System.out.println( this.Name +" Explains now ");
    }

    //overloading
    public  void Explain ()
    {
        System.out.println(" Explains now ");
    }
    public  void Countt()
    {
       count++;
    }

}
