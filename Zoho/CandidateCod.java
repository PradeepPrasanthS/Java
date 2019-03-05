/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCod {
    public static void main(String args[] ) throws Exception {

    	//Write code here
    	Scanner sc = new Scanner(System.in);
    	Double a = sc.nextDouble();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	double si = a*b*c/100;
    	System.out.print((int)si);
   }
}
