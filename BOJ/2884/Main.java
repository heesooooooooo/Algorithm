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
		int h,m;
		h=input.nextInt();
		m=input.nextInt();
		
		if(m<45){
			if(h==0){
				h=23;
			}
			else{
				h=h-1;
			}
			m=m+15;
		}
		else{
			m=m-45;
		}
		
		if(m==0){
			System.out.println(h);
		}
		else{
			System.out.println(h+" "+m);
		}
	}
	
}
