package think;

import java.util.Scanner;

/**
 * 
 * @author HEESOO
 *
 */
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		int a,b;
		
		for(int i=1;i<=t;i++){
			a=input.nextInt();
			b=input.nextInt();
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));			
		}
	}
		
	
}
