package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Array_class {

    private int[] a;
    private int n;

    public Array_class(){
        /*System.out.println("\n Please enter the size for Array ");

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        System.out.println("\n Value iof size : " + String.valueOf(n) );

        a = new int[n];

        System.out.println("\n Please enter the elements for Array ");

        for (int i = 0; i < n; i++) {

            a[i] = scanner.nextInt();
        }

        printArray();*/

        n = 12;
        a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = i+1;
        }
        printArray();

    }
    /*
    * Write a function rotate(ar[], d, n)
    * that rotates arr[] of size n by d elements.
    */
    public void rotate1(int d){
        if(d == 0)
        {
            System.out.println("Rotation Size is null/zero");
            return;

        }
        if(n == 0)
        {
            System.out.println("Size is Zero");
            return;
        }

        if(d > n)
        {
            d = d%n;
        }

        System.out.println("\n Before Rotation1 \n");
        printArray();
        int[] temp = new int[d];
        int i=0,k=0;

        for(; i<d; i++)
        {
            temp[i] = a[i];
        }
        for(; i<n; i++)
        {
            a[k] = a[i];
            k++;
        }
        i=0;
        for(; k<n; k++)
        {
            a[k]= temp[i];
            i++;
        }
        System.out.println("\n After Rotation1 \n");
        printArray();
    }

    public void printArray(){
        for (int i = 0; i < n; i++) {

            System.out.print(String.valueOf(a[i]) + "~");

        }
        System.out.println();
    }

    /*
    * Write a function rotate(ar[], d, n)
    * that rotates arr[] of size n by d elements.
    */
    public void rotate2(int d){
        if(d == 0 || d%n == 0)
        {
            System.out.println("Rotation not required");
            printArray();
            return;

        }
        if(n == 0)
        {
            System.out.println("Size is Zero");
            return;
        }

        if(d > n)
        {
            d = d%n;
        }

        System.out.println("\n Before Rotation1 \n");
        printArray();

        reverse(0,d);
        reverse (d, n);
        reverse(0,n);

        System.out.println("\n After Rotation1 \n");
        printArray();
    }

    private void reverse(int x, int y){

        int t;

        while(x<=y)
        {
            t=a[x];
            a[x]=a[y-1];
            a[y-1]=t;
            x++;
            y--;
        }

    }

}
