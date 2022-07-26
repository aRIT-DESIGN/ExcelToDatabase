package com.ImportExcel.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) throws Exception {
		// CodeChief Even Equal Odd 

	    
		Scanner myObj = new Scanner(System.in);
		int T = myObj.nextInt();

		while (T-- > 0) {
			int N = myObj.nextInt();
			int N1 = 2 * N;
			int ctr_even = 0, ctr_odd = 0;

			int[] Arr = new int[N1];
			for (int i = 0; i < N1; i++) {
				Arr[i] = myObj.nextInt();
			}

			for (int i = 0; i < Arr.length; i++) {
				if (Arr[i] % 2 == 0) {
					ctr_even++;
				} else
					ctr_odd++;
			}

			if (ctr_even == ctr_odd) {
				System.out.println(0);
			} else if (ctr_even < ctr_odd) {
				System.out.println(Math.abs(ctr_odd - ctr_even) / 2);
			} else {
				Stack<Integer> arrays = new Stack<>();
				for (int i = 0; i < Arr.length; i++) {
					if (Arr[i] % 2 == 0) {
						int step = 0;
						int e = Arr[i];
						while (e % 2 == 0) {
							step++;
							e /= 2;
						}
						arrays.push(step);
					}
				}

				Object[] arr = arrays.toArray();
				Integer[] intArr = new Integer[arr.length];
				for (int i = 0; i < arr.length; i++) {
					intArr[i] = (Integer) arr[i];
				}
				int sum = 0;
				Arrays.sort(intArr);
				for (int i = 0; i < ((ctr_even - ctr_odd) / 2); i++) {
					sum += intArr[i];
				}
				System.out.println(sum);
			}

		}
	}
}
