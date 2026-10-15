package basics;

import java.util.Scanner;

public class RevStrings {
	public static void main(RevStrings args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev +=s.charAt(i);
		}
		System.out.print(rev);
	}

}
