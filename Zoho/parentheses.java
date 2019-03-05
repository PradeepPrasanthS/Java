import java.util.Scanner;
import java.util.*;
public class parentheses {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char ch;
		int count=0;
		String a = sc.nextLine();
		StringBuilder word = new StringBuilder(a);
		for(int i=0;i<word.length();i++){
			ch = word.charAt(i);
			if(ch=='('){
				count++;
				System.out.println(i);
			}
			if(ch==')'){
				count--;
				System.out.println(i);
			}
		}
	}
}
