import java.util.*;
public class arrange {
	private static Scanner sc;
	public static void arrang(){
		sc = new Scanner(System.in);
		String word = sc.next();
		int length = word.length()-1;
		for(int i=0;i<word.length();i++){
			for(int j=0;j<word.length();j++){
				if(i==j&&i!=word.length()/2){
					System.out.print(word.charAt(i));
				}
				if(j==length){
					System.out.print(word.charAt(length));
					length--;
				}
				else{
					System.out.print(" ");
				}
			}
				System.out.println("");
		}
	}
	public static void main(String args[]){
		arrang();
	}
}
