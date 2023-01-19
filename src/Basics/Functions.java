package Basics;

public class Functions { //pascal


    public static void main(String[] args) {

        int x =  5;
        int y = 10;
        //calling
        sum(x,y);
       int w = 50 ;//global
       w += 90 ;
       int ay7aga = CalcSum(10,20,30);
        System.out.println(ay7aga);
        System.out.println(CalcAvg2(ay7aga));
        Print(ay7aga,CalcAvg2(ay7aga));

    }
        //define
    public  static  int sum (int z , int q)
    {
        int res = z + q ; //local
        return  res ;
        //System.out.println( number1 + number2);
    }

    public  static  int CalcSum(int n1 , int n2 , int n3)
    {
        return n1+ n2 +n3 ;
    }
    public  static  int CalcAvg1(int n1 , int n2 , int n3)
    {
        return (n1+ n2 +n3)/3 ;
    }
    public  static  int CalcAvg2(int ay7aga)
    {
        return ay7aga/3 ;
    }
    public  static  void Print (int s , int a)
    {
        System.out.println("Sum: " + s + " Avg: " +a);
    }


    }



