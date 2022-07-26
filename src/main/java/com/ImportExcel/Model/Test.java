package com.ImportExcel.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}



public class Test {
	    
//	private NodeTree root;
//
//    private class NodeTree{
//    	private NodeTree left =null,right=null;
//    	private int data;
//    	
//    	public NodeTree(int data){
//        	this.data= data;
//        	
//        }
//    }
    
//    public NodeTree CreateBinaryTree() {
//    	NodeTree first= new NodeTree(1);
//    	NodeTree second= new NodeTree(2);
//    	NodeTree third= new NodeTree(3);
//    	NodeTree fourth= new NodeTree(4);
//    	NodeTree five= new NodeTree(5);
//    	
//    	root= first;
//    	root.left=second;
//    	root.right=third;
//    	root.left.left=fourth;
//    	root.left.right=five;
//    	
//    	return root;
//    }
    
	public static void main(String[] args) {
		
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        
        leftView(root);

//	List<Integer> list	=Arrays.asList(1,2,3,4,5);
//	
//
//   Integer a= list.parallelStream().mapToInt(Integer::intValue).sum();
//   System.out.println(a);
//   
//   Integer b= list.parallelStream().reduce(0,(x,y)-> x + y);
//   System.out.println(b);
		
//1.Reverse of String
		
//		String s = "Arit";
//
//		String s1 = "";
//
//		for (int i = 0; i < s.length(); i++) {
//
//			char c = s.charAt(i);
//			System.out.println(c);
//			s1 = c + s1;
//		}
//		System.out.println(s1);

//2.Reverse of Integer

//		System.out.println("Enter Your Number:-");	
//		Scanner ref= new Scanner(System.in);
//		int num =ref.nextInt();
//		int reverse=0;
//		while(num!=0) {
//			int remain=num%10; 
//			reverse=(reverse*10)+remain;
//			num = num/10;  
//		}
//		
//		System.out.println(reverse);
		
//palindrome number
		
//	System.out.println("Enter Your Number:-");	
//	Scanner ref= new Scanner(System.in);
//	int number =ref.nextInt();
//	int reverse =0;
//	int c=number;
//	while(number!=0)
//	{
//      int remainder = number%10;
//      reverse= (reverse*10)+remainder;
//      number=number/10;
//	}
//	
//	if(reverse==c) {
//		System.out.println(c+"is palindrome");
//	}
//	else {System.out.println(c+"not is palindrome");}
	
//prime number	
		
//		 System.out.println("Enter your number:--");
//	      Scanner sc= new Scanner(System.in);
//	      int number=sc.nextInt();
//	      boolean flag=true;
//	      for(int i=2;i<number;i++) {
//	    	  if(number%i==0) {
//	    		 flag=false;
//	    		 }
//	      }
//	      
//	    	  if(flag) {
//	    		  System.out.println(number+" is prime");
//	    		  }
//	    	  else {
//	    		  System.out.println(number+"is not prime");
//	    		  }
	     
////fibonacci series
//		System.out.println("Enter The Count:-");
//		Scanner scanner = new Scanner(System.in);
//		int n1=0,n2=1,n3,count=scanner.nextInt();
//		
//		System.out.print(n1+" "+n2);
//		
//		for(int i=2;i<count;i++) {
//			n3=n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//		}
	
//Prime Number In Between 10-30
//		
//		System.out.println("Enter The Num:-");
//		Scanner scanner = new Scanner(System.in);
//		int num=scanner.nextInt();
//		boolean flag=true;
//		
//		for(int i=2;i<num;i++) {
//			if(num%i==0) {
//				flag=false;
//			}
//		}
//			if(flag) {
//				System.out.println("prime number");
//			}
//			else {
//			System.out.println("not prime number");}
//			
		
//		List<Integer> list= Arrays.asList(1,2,3,4,5);
		
//		Integer a = list.parallelStream().mapToInt(Integer::intValue).sum();
//		System.out.println(a);
		
//		Integer a =list.parallelStream().filter(n->n%2==0).mapToInt(Integer::intValue).findFirst().getAsInt();
//		System.out.println(a);
	      
		
//factorial:---5*4*3*2*1
		
//		System.out.println("Enter The Number:--");
//		Scanner sc= new Scanner(System.in);
//		int num=sc.nextInt();
//		int fact=1;
//		for(int i=1;i<=num;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		

//reverse of numbers:--------------------
		
//		System.out.println("Enter The count:--");
//		Scanner sc= new Scanner(System.in);
//		int count=sc.nextInt();
//		int c=num;
//		int remain=0;
//		int reverse=0;
//		while(num>0) {
//			remain=num%10;//2
//			reverse=reverse*10+remain;
//			num=num/10;//1
//		}
//		if(c==reverse) {
//			System.out.println("It is Palindrome");
//		}
//		else {
//			System.out.println("It is not Palindrome");	
//		}
//		int n1=0,n2=1,n3;
//		System.out.print(n1+" "+n2);
//		for(int i=2;i<count;i++) {
//			n3=n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//		}

		
//occurance of character 
		
//		String s="HelloJavaaa";
//		
//		Map<Object, Long> map=s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
//		Long maxvalue =Collections.max(map.values());
//		map.forEach((k,v)->{
//		if(v==maxvalue) {	
//		System.out.println(k +" : "+v);	
//		}
//		});
		
//		Map<Character,Integer> map = new HashMap<>();
//        
//		char[] c=s.toCharArray();
//		
//		for(char ch:c) {
//			//System.out.println(ch);
//			if(map.containsKey(ch)) {
//				map.put(ch,map.get(ch)+1);
//			}
//			else {
//				map.put(ch,1);	
//			}
//		}
//		
//		int maxValue= Collections.max(map.values());
//		for(Entry<Character, Integer> entry: map.entrySet()) {
//          if(entry.getValue() == maxValue) {
//        	  System.out.println(entry.getKey() +" : "+entry.getValue() );
//          }			
//		}
		
		
//		int[] names= {1,2,2,5,4};
//		List<Integer> list = new ArrayList<Integer>(); 
//		
//		for(int name:names) {
//		list.add(name);	
//		}
//		System.out.println("Before"+list);
//		list.stream().sorted(Comparator.reverseOrder()).forEach(e->{System.out.print("After Reverse"+e);});

//		anagram
//	String s1="Race";
//	String s2="Care";
//	
//	if(s1.length()==s2.length()) {
//	
//    
//	char[] c1=s1.toLowerCase().toCharArray(); // r,a,c,e
//	char[] c2=s2.toLowerCase().toCharArray(); //c,a,r,e
//	
//
//	Arrays.sort(c1);// a,c,e,r
//	Arrays.sort(c2);// a,c,e,r
//	
//	
//	boolean b=Arrays.equals(c1, c2);
//	
//	if(b) {
//		System.out.println("Strings are anagram");	
//	}
//	else {
//		System.out.println("Strings are not anagram");
//	}
//	}
//	else {
//		System.out.println("Strings are not anagram");
//	}
//	}
		
//	Reverse of num
//	
//		int a=123,reverse=0;
//		int remain=0;
//		while(a>0) {
//			remain=a%10;//3
//			reverse=(reverse*10)+remain;
//			a=a/10; 
//			
//		}
//		System.out.println(reverse);
//	}
	
//Binary Search 
//		int[] a= {1,2,3,4,5,6,7,8,9};
//		System.out.println("eNTER YOUR iTEMS:-");
//		Scanner sc= new Scanner(System.in);
//		int item=sc.nextInt();
//		int li=0;
//		int hi=a.length-1;//8
//		int mi= (li+hi)/2;//4
//		
//		while(li<=hi) {
//		if(a[mi] == item) {
//			System.out.println("item is in "+ mi +" position");
//			break;
//		}
//		 
//		else if(a[mi]<item) {
//			li=mi+1;
//		}
//		else {
//		  hi=mi-1;	
//		}
//		
//		mi=(li+hi)/2;
//		}
//		if(li>hi) {
//			System.out.println("No such elements are there");
//		}
		
		
//		String s="Javaaaa";
//		
//		char[] ch=s.toLowerCase().toCharArray();
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		
//		for(Character cha: ch) {
//			if(map.containsKey(cha)) {
//				map.put(cha, map.get(cha)+1);
//			}
//			else {
//				map.put(cha, 1);	
//			}
//			
//		}
//		
//		int count = Collections.max(map.values());
//		for(Entry<Character, Integer> entry:map.entrySet()) {
//			if(entry.getValue()==count) {
//				System.out.print(entry.getKey()+"  "+entry.getValue());
//			}
//		}
		
		
		
	}

private static void leftView(Node root) {
	
}		
}


