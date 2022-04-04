package com.GC;
//Dev:Justin Fredericks
//Class: 171
//Date: 4/4/2022
//Script: check and display execution time for finding prime numbers with in passed in ranges
public class Main {

    public static void main(String[] args) {
        getTime(100);
        getTime(10000);
        getTime(100000);
    }//main

    public static void getTime(long n){
        long startTime = System.currentTimeMillis();


        for (int i = 1; i <= n; i++)
        {
            int counter=0;
            for(int num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {

                System.out.print(i+" ");

            }
        }//end of for
        long endTime = System.currentTimeMillis();
        System.out.print("\nExecution time was " + (endTime - startTime) +" Milliseconds\n");

    }
}
