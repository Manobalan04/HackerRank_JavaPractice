//   In this challenge, you must read integers from stdin and then print them to stdout. Each 
//   integer must be printed on a new line. To make the problem a little easier, a portion of the 
//   code is provided for you in the editor below.

//   There are lines of input, and each line contains a single integer

//   Sample Input
//   42
//   100
//   125

//   Sample Output
//   42
//   100
//   125


package easy;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
        
        int []arr=new int[3];
        for(int i=0;i<3;i++){
        int a = sc.nextInt();
        arr[i]=a;
        }

        for(int f: arr){
            System.out.println(f);
		
	}

}
}
