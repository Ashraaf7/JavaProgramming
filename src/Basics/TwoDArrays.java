package Basics;

import java.util.Scanner;

public class TwoDArrays { //pascal


    public static void main(String[] args) {
/*
         int [][] arr ={   {1,2,3},
                            {4,5,6},
                             {7,8,9}
                                        };
       //  String [][] arr2 = new String[6][7];
        //System.out.println(arr2[0][0]);
        for (int i =0;i<=2 ; i++){ //row
            for (int j = 0;j<=2;j++) //columns
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

*/
      /*  arr2 = arr ;
        arr[0] = 50 ;
        arr2[3] = 200;
        System.out.println(arr[3]);*/
        //Swapping
      /*  for (int i =0;i<=4 ; i++){
            arr2[i] = arr [i];
        }
        //print
        for (int i =0;i<=4 ; i++){
            System.out.println(arr2[i]);
        }*/


        //Example
        Scanner input = new Scanner(System.in);
        int [][] array = new int[4][4] ;
        int sum = 0;
        int dSum = 0;
        for (int i = 0 ; i<= 3 ;i++) //rows
        {
            for(int j =0; j<=3;j++) //column
            {
                System.out.println("Enter Number" + (i)+(j));
                array[i][j]= input.nextInt();
                sum += array[i][j];
                if(i==j)
                   dSum += array[i][j] ;
            }
        }
        System.out.println("Sum= " + sum + " Diagonal= " + dSum);





        }

    }



