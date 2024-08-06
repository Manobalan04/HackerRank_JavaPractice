package easy;

import java.util.Scanner;

public class _6_Java_Loops_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int result=0;
		for(int i=1; i<=10; i++) {
			result=n*i;
			System.out.println(n+" x "+i+" = "+ result);
		}
		
	}

}
