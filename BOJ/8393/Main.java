import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n,result=0;
		n=input.nextInt();
		for(int i=1;i<=n;i++){
			result+=i;
		}
		System.out.println(result);
	}
}
