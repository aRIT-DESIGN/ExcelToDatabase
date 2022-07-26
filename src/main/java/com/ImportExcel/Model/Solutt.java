package com.ImportExcel.Model;

import java.util.Scanner;
import java.util.Vector;

public class Solutt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T --> 0) 
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			String[][] arr = new String[N][M];
			for(int i=0;i < N ;i++ ) 
			{
				for(int j=0;j < M ;j++ ) 
				{
					String charMatrix = sc.nextLine();
					arr[i][j] = charMatrix;
				}
			}
			
		}
	 }
}
