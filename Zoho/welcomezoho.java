import java.util.Scanner;

public class welcomezoho {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String word1 = sc.next();
		int r = word.length();
		int r1 = word1.length();
		int rem = r%5;
		int val = r - rem;
		char[][] arr = new char[6][r];
		int n=0;
		for(int i=0;i<(r/5)+1;i++){
			for(int j=0;j<5;j++){
				if(n<val){
					arr[i][j]=word.charAt(n);
					n++;
				}
				else if(rem!=0){
					arr[i][j]=word.charAt(n);
					n++;
					rem--;
				}
		        System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		for(int i=0;i<(r/5);i++){
			for(int j=0;j<5;j++){
				if(arr[i][j]==word1.charAt(0)){
					for(int k=1;k<r1;k++){
						if(arr[i][j++]==word1.charAt(k)){
							if(k==(r1-1)){
								System.out.println("Start index: "+i+" , "+(j-(r1-1)));
								System.out.println("End index: "+i+" , "+j+arr[i][j]);
							}
						}
					}
				}
			}
		}
	}
}