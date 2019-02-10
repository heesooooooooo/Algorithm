import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		int[][] apart=new int[15][15];
		
		for(int i=0;i<15;i++){
			apart[0][i]=i;//0층 초기화
			apart[i][1]=1;//1호 초기화
		}
		
		for(int i=1;i<15;i++){
			for(int j=1;j<15;j++){
				apart[i][j]=apart[i][j-1]+apart[i-1][j];
			}
		}
		for(int i=0;i<t;i++){
			int k=input.nextInt();
			int n=input.nextInt();
			
			System.out.println(apart[k][n]);
		}
	}
}
