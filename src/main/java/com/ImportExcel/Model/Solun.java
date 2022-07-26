package com.ImportExcel.Model;

import java.util.Scanner;

public class Solun {

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
        int T = myObj.nextInt();
        while(T --> 0)
        {
            int N = myObj.nextInt();
            int P = N,Q = 1;
            for(int i=1;i<=N;i++)
            {
             if(i%2 == 0)
             {
            	System.out.println(Q);
             	Q++;   
             } 
             else
             {
            	System.out.println(P);
            	P--;
             }	 
            }
            
            System.out.println(" ");
        }

	}

}
