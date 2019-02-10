import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int result=0;
		String s=input.next();
		for(int i=0;i<n;i++){
			result+=Integer.parseInt(s.substring(i, i+1));
		}
		System.out.println(result);
	}
}
