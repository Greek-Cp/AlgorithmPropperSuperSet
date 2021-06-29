package com.belajar.oop.inheritance;

public class HimpunanKuasa {
    static void getAkuasa(int arr[]){

        // {1,2} = 0 , 1, 2 , {1,2} = P(A) = 2 pow A = 4
        int getElementIndex = arr.length;
        for(int c = 0; c<= arr.length; c++){
            int Akuasa = c * 2;
            System.out.println("|Maka P(A) dari Jumlah Index A{"+ c+"} = P(A) = 2 pow A = " +Akuasa );
        }
    }
    public static void main(String[]args){
        int A[] = {1,2,3,4,5,6,7,8,9};
        getAkuasa(A);

    }
}
