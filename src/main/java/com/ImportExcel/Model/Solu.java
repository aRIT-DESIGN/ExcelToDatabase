package com.ImportExcel.Model;

import java.util.Scanner;

public class Solu {

	public static void main(String[] args) {
		  Scanner myObj = new Scanner(System.in);
	        int T = myObj.nextInt();
	        
	        while(T --> 0)
	           {
	                int count=0;
	                int N = myObj.nextInt();
	                String str = myObj.next();
	                for(int i=0;i<N-2;i++)
	                {
	                    if(str.charAt(i) =='0')
	                    {
	                        if(str.charAt(i+1) =='1')
	                        {
	                            count++;
	                        }
	                    }
	                }
	                
	                if(str.charAt(0) =='1')
	                {
	                    count++;
	                }
	                if(str.charAt(N-2) =='0')
	                {
	                    count++;
	                }
	                if(count == 0)
	                {
	                    System.out.println(1);
	                }
	                else
	                {
	                    System.out.println(count);
	                }
	            }
	}

}
