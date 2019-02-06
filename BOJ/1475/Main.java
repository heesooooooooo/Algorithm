import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String n=input.nextLine();
		int number[]=new int[10];
		char ch;
		for(int i=0;i<n.length();i++){
			ch=n.charAt(i);
			if(ch=='9'){
				ch='6';
			}
			number[ch-'0']++;
		}
		if(number[6]%2==0){
			number[6]=number[6]/2;
		}
		else{
			number[6]=number[6]/2+1;
		}
		int max=number[0];
		for(int i=1;i<number.length;i++){
			if(max<number[i]){
				max=number[i];
			}
		}
		System.out.println(max);
	}
}
