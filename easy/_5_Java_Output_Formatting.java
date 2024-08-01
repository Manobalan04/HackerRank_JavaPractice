package easy;

import java.util.Scanner;

public class _5_Java_Output_Formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
	        
	        System.out.println("================================");
	        for(int i=0;i<3;i++){
	            String s=sc.next();
	            int c=sc.nextInt();
	            System.out.printf("%-15s%03d%n",s,c);
	        }
	        System.out.println("================================");
	        
	    }

}
