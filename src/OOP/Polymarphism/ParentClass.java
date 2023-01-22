package OOP.Polymarphism;

public class ParentClass {
    protected String Name ;
    public  static int count = 0 ;
    public  int Id;
    public String Subject ;

    public void  Print ()
    {
        System.out.println(Name + " " + Id + " " + Subject );

    }
    public void Play ()
    {
        System.out.println("Can NOT Playing");
    }
}
