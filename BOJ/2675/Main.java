import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		String s[]=new String[t];
		int count;
		int r[]=new int[t];
		for(int i=0;i<t;i++){
			r[i]=input.nextInt();
			s[i]=input.next();
		}
		for(int i=0;i<t;i++){
			count=r[i];
			for(int j=0;j<s[i].length();j++){
				while(count>0){
					System.out.print(s[i].charAt(j));
					count--;
				}
				count=r[i];
			}
			System.out.println();
		}
		
	}
}
