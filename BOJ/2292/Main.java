import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int room=input.nextInt();
		input.close();
		
		int result=1;
		int six=6;
		int now=1;
		
		while(result<room){
			result+=six;
			six+=6;
			now++;
		}
		System.out.println(now);
		
	}
}
