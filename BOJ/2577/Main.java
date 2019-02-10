import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		int count[]=new int[10];
		
		String s=String.valueOf(a*b*c);
		for(int i=0;i<s.length();i++){
			count[s.charAt(i)-48]++;
		}
		for(int i=0;i<count.length;i++){
			System.out.println(count[i]);
		}
	}
}
