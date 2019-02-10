import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String num[]=new String[2];
		num[0]=input.next();
		num[1]=input.next();
		for(int i=0;i<2;i++){
			String temp="";
			for(int j=num[i].length()-1;j>=0;j--){
				temp+=num[i].charAt(j);
			}
			num[i]=temp;
		}
		if(Integer.parseInt(num[0])>Integer.parseInt(num[1])){
			System.out.println(num[0]);
		}
		else{
			System.out.println(num[1]);
		}
	}
}
