import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int x=input.nextInt();
		for(int i=0;i<n;i++){
			int now=input.nextInt();
			if(now<x){
				System.out.print(now+" ");
			}
		}
	}
}
