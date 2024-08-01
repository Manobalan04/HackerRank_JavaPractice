/*
Input Format
Every line of input will contain a String followed by an integer. 
Each String will have a maximum of 1010 alphabetic characters, and each integer will be in the inclusive range from 00 to 999999.

Output Format
In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly 1515 characters. 
The second column contains the integer, expressed in exactly 33 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input
java 100
cpp 65
python 50

Sample Output
================================
java           100 
cpp            065 
python         050 
================================
*/

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

/*
-->First of all we will use System.out.format instead of System.out.println as it is use to format 
the output. So our code will be –> System.out.format();

-->Next we will use Modulus(%) within double quote. So our code will be –> System.out.format(“% “);

-->Next we will use ‘-‘ after modulus which will instruct the compiler that it will be left indent,
if you want to use right indent do not use “-“. So our code will be –> System.out.format(“%- “);

-->The 15 makes our String to be a minimum length of 15, it is required as per the question. So our 
code will be –> System.out.format(“%-15”);

-->s will be substituted by our String. This will mark the end of first requirement. So our code 
will be –> System.out.format(“%-15s”);

-->Now the second part of the question. So again we will put %  and put 3d in order to  format 
integer. The 3 makes our integer be a minimum length of 3. So our
 code will be –> System.out.format(“%-15s%3d”);

-->%n will help to go to the next line 
*/