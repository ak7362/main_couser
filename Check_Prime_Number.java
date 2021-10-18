package main_couser;
import java.util.Scanner;
public class Check_Prime_Number {
	public static void main(String args[]) {
		System.out.println("Entet the number:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x==1 || x==2) {
			System.out.println("Prime number");
		}
		int i,temp=0;
		for (i=2;i<x;i++) {
			if(x%i==0)
		        temp=temp+1;
		  }	
		if(temp==0) 
			System.out.println("Prime number");
		else
			System.out.println("Not prime number");
		}
	}
	


