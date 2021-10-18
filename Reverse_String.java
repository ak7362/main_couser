package main_couser;

public class Reverse_String {
	public static void main(String args[]) {
		String s="Ashish";
		String rev="";
		int x=s.length();
		for(int i=x-1;i>0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
