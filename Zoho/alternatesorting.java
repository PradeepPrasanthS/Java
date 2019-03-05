import java.util.Arrays;
import java.util.Scanner;

public class alternatesorting {
	private static Scanner sc;

	public static void main(String args[]){
		sc = new Scanner(System.in);
		int tot = sc.nextInt();
		int tot1 = 0;
		int arr[] = new int[tot];
		int arr1[] = new int[tot];
		for(int i=0;i<tot;i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				arr1[i] = arr[tot-1];
				tot = tot-1;
			}
			else{
				arr1[i] = arr[tot1];
				tot1 = tot1+1;
			}
		}
		System.out.print("{ ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr1[i]);
			if(i!=arr.length-1){
				System.out.print(" , ");
			}
		}
		System.out.print(" }");
	}
}
