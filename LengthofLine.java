package geometry;
import java.util.Scanner;
public class LengthofLine {
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
	
	double length = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
	System.out.println("Length of line is " +length);
}
}

