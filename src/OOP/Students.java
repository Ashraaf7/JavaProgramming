package OOP;

public class Students extends ParentClass {
    //attributes


    //methods
    public Students ()
    {

    }
    public Students (String name , int id , String subject)
    {
        this.Name =name ;
        this.Id = id ;
        this.Subject = subject ;
        count++;
    }
    public Students (String name , int id)
    {
        this.Name =name ;
        this.Id = id ;
        count++;
    }
    public Students (String name )
    {
        this.Name =name ;
        count++;
    }
    public void Study()
    {
        System.out.println("Studying");
    }
    public static  void compare (Students s1 , Students s2)
    {
        if (s1.Name==s2.Name && s1.Id == s2.Id && s1.Subject == s2.Subject)
            System.out.println("======");
    }
    public static  void copy (Students s1 , Students s2)
    {
        s1.Name=s2.Name ;
        s1.Id = s2.Id;
        s1.Subject = s2.Subject;

    }
 //Overriding
    @Override
    public void  Play()
    {
        System.out.println("Can Play");
    }

}
