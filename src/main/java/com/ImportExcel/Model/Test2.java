package com.ImportExcel.Model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		String S = "100101110000001011000001111110010011110010010111000101";
		
		System.out.println(S.length());
//		String s="EY";
//		
//		Map<Character, Integer> map= new HashMap<Character, Integer>();
//		
//		for (int i = 0; i < s.length(); i++) {
//
//			char c = s.toLowerCase().charAt(i);
//			
//			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
//			if (map.containsKey(c)) {
//				map.put(c, map.get(c) + 1);
//			} else {
//				map.put(c, 1);
//			}
//			}
//			else {
//				if (map.containsKey(c)) {
//					map.put(c, map.get(c) + 1);
//				} else {
//					map.put(c, 1);
//				}
//			}
			
//		}
//		int count=Collections.max(map.values());
//		for(Entry<Character, Integer> entry:map.entrySet()) {
////			 if(entry.getValue()==count) {
////				 System.out.println(entry.getKey()+":"+entry.getValue());
////			 }
////			 else
//			if(entry.getValue()>1) {
//				 System.out.println(entry.getKey()+":"+entry.getValue());
//			 }
//			else {
//				 System.out.println(entry.getKey()+":"+entry.getValue());
//			 }
//			}
//
//		
		
//		int n0=0;
//		int n1=1; 
//		int count =5;
//		int n2;
//		System.out.print(n0 +" "+n1);
//		for(int i=0;i<count;i++) {
//			n2=n0+n1;
//			System.out.print(" "+n2);		
//			n0=n1;
//			n1=n2;
//			
//		}

//	  int a=123;
//	  int rev=0;
//	  int rem=0;
//	  while(a>0) {
//		  rem=a%10;
//		  rev=rev*10+rem;
//		  a=a/10;
//	  }
//	  
//	  System.out.println(rev);
	  
//	String s="JAVA";
//	String s1="";
//	
//	for(int i=0;i<s.length();i++) {
//		char c= s.charAt(i);
//		s1=c+s1;
//	}
//	System.out.print(s1);
	
//		String s="RACEE";
//		String s1="CARE";
//		
//	  if(s.length()==s1.length()) {
//		  
//		  char[] c1 = s.toLowerCase().toCharArray();
//		  char[] c2 = s1.toLowerCase().toCharArray();
//		  
//		  Arrays.sort(c1);
//		  Arrays.sort(c2);
//		  boolean b = Arrays.equals(c1, c2);
//		  
//		  if(b) {
//			  System.out.println("Strings are anagram");
//		  }
//		  else {
//			  System.out.println("Not an anagram");
//		  }
//		  
//	  }
//	  else {
//		  System.out.println("Not an anagram");
//	  }
	
//	int[] a= {1,2,3,4,5,6,7};	
//	int target =2;	
//	int li=0;
//	int hi=a.length-1 ;	
//	int mi=(hi+li)/2;  //3
//	
//	while(li<=hi) {
//		if(a[mi]==target){
//			System.out.println(mi);
//			break;
//		}
//		else if(a[mi]>target){
//			hi=mi-1;
//		}
//		else {
//		   li=mi+1;	
//		}
//		
//		mi=(hi+li)/2;
//	}
		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put(null, 1);
//		System.out.println(map);
//		System.out.println("-----------------------------------------");
//		Map<String, Integer> map1 = new ConcurrentHashMap<String, Integer>();
//		map1.put(null, 1);
//		System.out.println(map1);
//		System.out.println("-----------------------------------------");
//		Map<String, Integer> map2 = new Hashtable<String, Integer>();
//		map2.put(null, 1);
//		System.out.println(map2);
	
	}

}
