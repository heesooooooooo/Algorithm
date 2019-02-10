import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String word=input.nextLine();
		input.close();
		
		int time=0;
		for(int i=0;i<word.length();i++){
			char now=word.charAt(i);
			if('A'<=now&&now<='C'){
				time+=3;
			}
			else if('D'<=now&&now<='F'){
				time+=4;
			}
			else if('G'<=now&&now<='I'){
				time+=5;
			}
			else if('J'<=now&&now<='L'){
				time+=6;
			}
			else if('M'<=now&&now<='O'){
				time+=7;
			}
			else if('P'<=now&&now<='S'){
				time+=8;
			}
			else if('T'<=now&&now<='V'){
				time+=9;
			}
			else{
				time+=10;
			}
		}
		System.out.println(time);
	}
}
