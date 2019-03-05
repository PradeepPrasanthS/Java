import java.util.*;
import java.lang.*;
public class numbers {
	private static Scanner sc;
	public static void main(String args[]){
		sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int arr1[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
			int sum =0;
			double sr = Math.sqrt(arr[i]);
			if(sr-Math.floor(sr)==0){
				sum = sum+5;
			}
			if(arr[i]%4==0&&arr[i]%6==0){
				sum = sum+4;
			}
			if(arr[i]%2==0){
				sum = sum+3;
			}
			arr1[i] = sum;
		}
		for(int j=0;j<size;j++){
			System.out.println("<"+arr[j]+","+arr1[j]+">");
		}
	}	
}
