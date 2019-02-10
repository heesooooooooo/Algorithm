import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String s=input.next();
		int i=0;
		while(i<=s.length()){
			if(i+10<=s.length()){
				System.out.println(s.substring(i,i+10));
			}
			else{
				System.out.println(s.substring(i,s.length()));
			}
			i+=10;
		}
	}
}
