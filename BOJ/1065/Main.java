import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		input.close();
		int result;
		if(n<100){
			result=n;
		}
		else{
			int now=110;
			int temp;
			result=99;
			while(now<=n){
				temp=now;
				int h=temp/100;
				temp=temp%100;
				int d=temp/10;
				int o=temp%10;
				
				if(h-d==d-o){
					result++;
				}
				now++;
			}
			
		}
		System.out.println(result);
	}
}
