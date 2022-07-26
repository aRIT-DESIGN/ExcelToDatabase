package com.ImportExcel.Model;

import java.io.*;
import java.util.*;




public class Testt {

	public static void main (String[] args) throws Exception
	{
    
        Scanner myObj = new Scanner(System.in);
    int T = myObj.nextInt();
    
    while(T --> 0){
       int N = myObj.nextInt();
       int N1 = 2*N;
   	   int ctr_even = 0, ctr_odd = 0;

       int[] Arr = new int[N1];
       for(int i=0; i<N1; i++)  
       {
       Arr[i]  = myObj.nextInt();
       }
       
       for(int i = 0; i < Arr.length; i++) {
           if(Arr[i] % 2 == 0)
   		{         
             ctr_even++;
   		}
   		else
   		     ctr_odd++;	
       }
    // System.out.println("even :"+ctr_even);
   	// System.out.println("odd :"+ctr_odd);
   	
   	    if(ctr_even==ctr_odd){System.out.println(0);}
   	    if(ctr_even > ctr_odd){System.out.println(ctr_even-N);}
   	    if(ctr_even < ctr_odd){System.out.println(ctr_odd-N);}
      }

	} 
   }
