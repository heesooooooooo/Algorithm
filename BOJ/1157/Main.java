import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		
		int alpha[]=new int[26];
		
		for(int i=0;i<str.length();i++){
			if('a'<=str.charAt(i)&&str.charAt(i)<='z'){
				alpha[str.charAt(i)-97]++;
			}
			else if('A'<=str.charAt(i)&&str.charAt(i)<='Z'){
				alpha[str.charAt(i)-65]++;
			}
		}
		int max=alpha[0];
		char cmax = 'A';
		boolean chk=false;
		for(int i=1;i<alpha.length;i++){
			if(alpha[i]==max){
				chk=true;
			}
			else if(alpha[i]>max){
				max=alpha[i];
				chk=false;
				cmax=(char) (i+65);
			}
			
		}
		if(chk){
			System.out.println("?");
		}
		else{
			System.out.println(cmax);
		}
	}
}
