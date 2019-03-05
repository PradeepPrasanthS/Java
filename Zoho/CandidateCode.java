import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
    	//Write code here
    	Scanner sc = new Scanner(System.in);
    	String any = sc.nextLine();
    	    try{
    	        Integer.parseInt(any);
    	        System.out.print("This input is of type Integer.");
    	    }catch(NumberFormatException e){
    	        try{
                    Double.parseDouble(any);
                    System.out.print("This input is of type Float.");
    	        }
    	        catch(NumberFormatException e2){
    	            try{
    	                any.toString();
    	                System.out.print("This input is of type String.");
    	            }
    	            catch(Exception e3){
    	                System.out.print("This is something else.");
    	            }
                }
    	   }
    	      
   }
}