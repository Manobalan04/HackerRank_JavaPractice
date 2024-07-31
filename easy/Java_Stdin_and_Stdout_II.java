//   There are three lines of input:

//   The first line contains an integer.
//   The second line contains a double.
//   The third line contains a String.

//   Sample Input
//   42
//   3.1415

//   Sample Output
//   String: Welcome to HackerRank's Java tutorials!
//   Double: 3.1415
//   Int: 42


package easy;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
        
        int i=sc.nextInt();
        double d=sc.nextDouble();
        sc.nextLine();
        String s=sc.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
		
	}

}
