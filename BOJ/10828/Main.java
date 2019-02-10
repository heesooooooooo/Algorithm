import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Stack<Integer> st=new Stack<>();
		
		int n=input.nextInt();
		String s;
		int x;
		
		while(n>0){
			s=input.next();
			if(s.equals("push")){
				x=input.nextInt();
				st.push(x);
			}
			else if(s.equals("pop")){
				if(st.isEmpty()){
					System.out.println("-1");
				}
				else{
					System.out.println(st.pop());
				}
			}
			else if(s.equals("size")){
				System.out.println(st.size());
			}
			else if(s.equals("empty")){
				if(st.isEmpty()){
					System.out.println("1");
				}
				else{
					System.out.println("0");
				}
			}
			else{
				if(st.isEmpty()){
					System.out.println("-1");
				}
				else{
					System.out.println(st.peek());
				}
			}
			n--;
		}
	}
}
