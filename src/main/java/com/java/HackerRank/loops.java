//Task 
//Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
//
//Input Format
//
//A single integer N
//
//Constraints
//  N >= 2 AND N <=20
// i>=1 and i <=10

//Sample Input
//
//2

//Sample Output
//
//2 x 1 = 2
//2 x 2 = 4
//2 x 3 = 6
//2 x 4 = 8
//2 x 5 = 10
//2 x 6 = 12
//2 x 7 = 14
//2 x 8 = 16
//2 x 9 = 18
//2 x 10 = 20
package com.java.HackerRank;

import java.util.Scanner;

public class loops {
	
	public static void main(String args[]) {
		Scanner scanner=  new Scanner(System.in);
		 System.out.println("Enter number");

		    int number = scanner.nextInt(); 
		    
		    if( number>=2 && number <= 20)
		    {
		    	for(int i=1;i<=10;i++)
		    	{
		    		System.out.println(number+"*"+i+"="+(number*i));
		    	}
		    }

	}
	
}
