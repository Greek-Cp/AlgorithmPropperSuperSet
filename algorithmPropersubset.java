package com.belajar.oop.inheritance;
import java.util.Scanner;
import java.lang.Math;
public class algorithmPropersubset {
    static int [] calculateSetA(int n){
        int setA[] = new int[n];
      //[equation x | x <= 10 - 1, x number odd]
        for(int x = 0; x<= setA.length - 1; x++){
            int b = x;
            if(b % 2 != 0){
                setA[x] = b;
            }
        }
        return setA;
    }
    static int [] calculateSetB(int n){
        int setB[] = new int[n];
        //[equation x^2 + y^2 | x ,y <= 10 - 1]
        for(int xy = 0; xy <= n -1; xy++){
            setB[xy] = (int) (Math.pow(xy,2) + Math.pow(xy,2));
            System.out.println("calculate: " + setB[xy]);
        }
        return setB;
    }
    static int exponen(int n,int expo){
         return (int) (Math.pow(n,expo) * 2);
    }
    public static void main(String[]args){
        System.out.println("algorithm proper subset");
        // A:{ x | x < 10 % != 0 , x number odd}
        int indexElemenA = 10;
        int A[] = new int[indexElemenA];
        A = calculateSetA(10); // 1 3 5 7 9
        for(int x = 0; x<= A.length -1;x++){
            System.out.println("element A: "+ A[x]);
        }
        int B[] = calculateSetB(11);
        System.out.println(exponen(10,2));
        for(int x = 0; x<= 10; x++){
            int c = exponen(x,2);
            System.out.println("after calculate: " + c);
        }
        // A c C
        int tempA[] = {1,3,5,7,9};
        int C[] = tempA;
        C = tempA;
        for(int s = 0; s< tempA.length;s++){
            System.out.println(C[s]);
        }

        //stuck
        /*
            case:
            A:{x | x number odd <= 10 - 1}
            B:{(x,y)^2|{x,y e number positive N}  (x+y)^2 <= 11 - 1}
            output:
            A c C {1,2,3,5,7,9}
            ...
            C c B {....}
            Cx: {....}

         */

    }
}
