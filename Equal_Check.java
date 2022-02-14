package geometry;

import java.util.Scanner;

public class Equal_Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x co-ordinate of A");
		int x1 = sc.nextInt();
		System.out.println("Enter y co-ordinate of A");
		int y1 = sc.nextInt();
		System.out.println("Enter x co-ordinate of B");
		int x2 = sc.nextInt();
		System.out.println("Enter y co-ordinate of B");
		int y2 = sc.nextInt();
		
		double length1 = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
		
		System.out.println("Enter x co-ordinate of C");
		int x3 = sc.nextInt();
		System.out.println("Enter y co-ordinate of C");
		int y3 = sc.nextInt();
		System.out.println("Enter x co-ordinate of D");
		int x4 = sc.nextInt();
		System.out.println("Enter y co-ordinate of D");
		int y4 = sc.nextInt();
		
		double length2 = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
		
		if(length1 == length2)
			System.out.println("lengths are Equal");
		else
			System.out.println("lengths are not Equal");

}
}
