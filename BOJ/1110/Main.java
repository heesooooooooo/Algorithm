import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String n=input.next();
		String first;
		if(n.length()==1){
			first="0"+n;
		}
		else{
			first=n;
		}
		int cycle=0;
		while(true){
			if(n.length()==1){
				String temp="0"+n;
				n=temp;
			}
			int plus=Integer.parseInt(n.substring(0,1))+Integer.parseInt(n.substring(1,2));
			String newInt;
			if(plus<10){
				newInt=n.substring(1,2)+String.valueOf(plus);
			}
			else{
				newInt=n.substring(1,2)+String.valueOf(plus).substring(1, 2);
			}
			n=newInt;
			cycle++;
			
			if(first.equals(n)){
				System.out.println(cycle);
				break;
			}
			
		}
	}
}
