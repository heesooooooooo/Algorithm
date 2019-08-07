package think;

import java.util.Scanner;

/**
 * 
 * @author HEESOO
 *
 */
public class Main {
	public static void main(String[] args){
		int a,b;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		
		if(a==b){
			System.out.println("==");
			return;
		}
		else if(a>b){
			System.out.println(">");
			return;
		}
		else{
			System.out.println("<");
		}
	}
	
}
