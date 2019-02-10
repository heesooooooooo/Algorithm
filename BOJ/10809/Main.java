import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		int num[]=new int[26];
		for(int i=0;i<num.length;i++){
			num[i]=-1;
		}
		
		for(int i=0;i<str.length();i++){
			if(num[str.charAt(i)-97]==-1){
				num[str.charAt(i)-97]=i;
			}
		}
		
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}
}
