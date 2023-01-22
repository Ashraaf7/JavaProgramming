package OOP;

 public class Doctors {
    //Attributes
    protected String Name ;
    public  static int count = 0 ;
    public  int Id;
    public String Subject ;
    public int salary;


    //Methods
    public void Explain (String Name)
    {
        System.out.println( this.Name +" Explains now ");
    }
    public  void Countt()
    {
       count++;
    }
}
