package OOP.Polymarphism;

public class Main {
    public static void main(String[] args) {
        Students student = new Students();
        Doctors doctor = new Doctors();
        doctor.Name= "Ahmed" ;
        //Overloading
        doctor.Explain();
        doctor.Explain(doctor.Name);

        //Overriding
        doctor.Play();
        student.Play();

    }
}
