package main_couser;

import java.util.Scanner;

public class Reverse_the_number {
	public static void main(String args[]) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem,rev=0;
	while(n!=0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;	
	}
	System.out.println(rev);
		
		
	}

}
