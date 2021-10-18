package main_couser;

import java.util.Scanner;

public class Print_all_prime_no {
	public static void main(String args[]) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(1+"\t");
		int i,j;
		for(i=2;i<n;i++) {
			int temp=0;
		  for(j=2;j<i;j++) {
			  if(i%j==0)
				  temp+=1;
			    break;
		  }
		  if(temp==0)
			  System.out.print(i+"\t");
		  
		}
	}

}
