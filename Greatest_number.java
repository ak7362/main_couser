package main_couser;
import java.util.Scanner;
public class Greatest_number {
	public static void main(String args[]) {
		System.out.println("Enter the three number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b &&a>c) {
			System.out.println("Greatest number is "+a);
		}
		if(b>c && b>a) {
			System.out.println("Greatest number is "+b);
		}
		else
			System.out.println("Greatest number is "+c);
		
	}

}
