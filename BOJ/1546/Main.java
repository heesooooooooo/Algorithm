import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int max=0;
		int score[]=new int[n];
		double result=0;
		for(int i=0;i<n;i++){
			int now=input.nextInt();
			score[i]=now;
			if(max<now){
				max=now;				
			}
		}
		for(int i=0;i<n;i++){
			result+=(double)score[i]/max*100;
		}
		System.out.println(result/n);
	}
}
