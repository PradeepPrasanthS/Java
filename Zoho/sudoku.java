import java.util.Scanner;

public class sudoku {
	public static void main(String args[]){
		int[][] num = new int[9][9];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				num[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<9;i++){
			int tot = 0;
			for(int j=0;j<9;j++){
				tot = tot+num[i][j];
			}
			if(tot!=45){
				System.out.println("N SUDOKU");
				break;
			}
		}
		for(int j=0;j<9;j++){
			int tot = 0;
			for(int i=0;i<9;i++){
				tot = tot+num[i][j];
			}
			if(tot!=45){
				System.out.println("NO SUDOKU");
				break;
			}
		}
		for(int i=0;i<9;i++){
			int tot=0;
			int row=0;
			int col=0;
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					tot = tot+num[row][col];
					col++;
				}
				row++;
			}
			if(tot!=45){
				System.out.println("NOT SUDOKU");
				break;
			}
		}
	}
}
