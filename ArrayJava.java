package com.belajar.array;

import java.util.LinkedHashSet;

public class ArrayJava {
    static int[] calculateSetA(int n){
        int setA[] = new int[n];
        for(int x = 0; x<=n; x++){
            int b = x;
            if( b % 2 != 0){
                setA[x] = b;
            }
        }

        return setA;
    }
    static int removeDuplicateNumber(int myarr[],int n ){
        if(n == 0 && n == 1){
            return n;
        }
        int temp[] = new int[n];
        int j =0;
        for(int x = 0; x< n - 1; x++){
            if(myarr[x]!= myarr[x+1]){
                temp[j++] = myarr[x];
            }
        }
        temp[j++] = myarr[n -1];
        for(int x = 0; x<=j - 1; x++){
            myarr[x] = temp[x];
        }
        return j;
    }
    static int[] removeDuplicate(int[]n ){
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        for(int x = 0; x<= n.length - 1; x++){
            set.add(n[x]);
        }
        System.out.println("hash set = " + set);
        return n;
    }
    public static void main(String[]args){
        int x = 0;
        int[] getSetA = calculateSetA(10);
        for(int c= 0; c<= getSetA.length -1;c++){
            System.out.println(getSetA[c]);
        }
        int length = getSetA.length;
////        length = removeDuplicateNumber(getSetA, getSetA.length);
////        for(int c= 0; c<=length; c++){
//            System.out.println(getSetA[c] +"remove");
//        }
        int d[] = removeDuplicate(getSetA);
        for(int s = 0; s<= d.length - 1; s++){
            System.out.println("after remove duplicate " +d[s] );
        }

    }
}
