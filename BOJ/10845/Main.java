package think;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Deque<Integer> queue=new LinkedList<Integer>();
		int n=input.nextInt();
		String s;
		int num;
		for(int i=0;i<n;i++){
			s=input.next();
			if(s.contains("push")){
				num=input.nextInt();
				queue.offer(num);
			}
			else if(s.contains("pop")){
				if(queue.isEmpty()){
					System.out.println("-1");
				}
				else{
					System.out.println(queue.poll());
				}				
			}
			else if(s.contains("size")){
				System.out.println(queue.size());
			}
			else if(s.contains("empty")){
				if(queue.isEmpty()){
					System.out.println("1");
				}
				else{
					System.out.println("0");
				}
			}
			else if(s.contains("front")){
				if(queue.isEmpty()){
					System.out.println("-1");
				}
				else{
					System.out.println(queue.peek());
				}
			}
			else{
				if(queue.isEmpty()){
					System.out.println("-1");
				}
				else{
					System.out.println(queue.peekLast());					
				}
			}
		}
		
		
		
	}
}
