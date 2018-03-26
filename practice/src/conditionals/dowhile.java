package conditionals;

import java.util.Scanner;

public class dowhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the i value");
		int i=sc.nextInt();
		
		
		do {
			System.out.println(i);
			i++;
			
		} while (i<=10);
	}

}
