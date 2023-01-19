package Basics;

public class OneDArrays { //pascal


    public static void main(String[] args) {
        final  int size = 5 ;
        int [] arr2 = new int [size]  ;
         int [] arr = new int [size] ;
         arr[0]= 1 ;
         arr[1] = 2 ;
        arr[2] = 3 ;
        arr[3] = 4 ;
        arr[4] = 5 ;
      /*  arr2 = arr ;
        arr[0] = 50 ;
        arr2[3] = 200;
        System.out.println(arr[3]);*/
        //Swapping
        for (int i =0;i<=4 ; i++){
            arr2[i] = arr [i];
        }
        //print
        for (int i =0;i<=4 ; i++){
            System.out.println(arr2[i]);
        }






        }

    }



