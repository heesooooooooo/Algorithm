import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int temp=n;
		int three=0,five=0;
		
		five=n/5;
		n=n%5;
        
		if(five>=1&&n%3==1){
			five--;
			n+=5;
		}
		if(five>=2&&n%3==2){
			five-=2;
			n+=10;
		}
		
		
		if(n%3==0){
			three=n/3;
			n=n%3;
		}
		else{
			five=0;
			System.out.println("-1");
			return;
		}
		System.out.println(three+five);
		
	}
}
