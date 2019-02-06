import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		int m;
		m=input.nextInt();
		
		for(int i=1;i<=m;i++){
			for(int j=m;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
