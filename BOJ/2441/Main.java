import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		int n;
		n=input.nextInt();
		for(int i=n;i>=1;i--){
			for(int k=n;k>i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
