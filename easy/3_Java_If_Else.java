//   Given an integer,n, perform the following conditional actions:

//   If is odd, print Weird
//   If is even and in the inclusive range of 2 to 5, print Not Weird
//   If is even and in the inclusive range of 6 to 20, print Weird
//   If is even and greater than 20, print Not Weird

package easy;

import java.util.Scanner;

public class Java_If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n%2!=0){
            System.out.println("Weird");
        }else {
            if(n>=2 && n<=5){
                System.out.println("Not Weird");
            }else if(n>=6 && n<=20){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
		
	}


	}
}
	
