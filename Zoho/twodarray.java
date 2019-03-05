import java.util.Scanner;

public class twodarray {
	private static String son;
	private static int count;

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String ar[][] = new String [4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<2;j++){
				ar[i][j] = sc.next();
			}
		}
		String in = sc.next();
		for(int i=0;i<4;i++){
			String out = ar[i][1];
			if(in.equals(out)){
				son = ar[i][0];
			}
		}
		for(int i=0;i<4;i++){
			String out = ar[i][1];
			if(out.equals(son)){
				count++;
			}
		}
		System.out.println(count);
	}
}
