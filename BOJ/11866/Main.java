package think;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Deque<Integer> dq=new LinkedList<Integer>();
		
		int n=input.nextInt();
		int m=input.nextInt();
		
		for(int i=1;i<=n;i++){
			dq.addLast(i);
		}
		
		System.out.print("<");
		while(!dq.isEmpty()){
			for(int j=0;j<m-1;j++){
				dq.addLast(dq.removeFirst());
			}
			System.out.print(dq.removeFirst());
			if(!dq.isEmpty()){
				System.out.print(", ");
			}
		}
		System.out.println(">");
		
				
	}
}
