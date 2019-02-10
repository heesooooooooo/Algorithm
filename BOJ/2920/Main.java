import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String sArray[]=str.split(" ");
		input.close();
		int num[]=new int[sArray.length];

		for(int i=0;i<num.length;i++){
			num[i]=Integer.parseInt(sArray[i]);
		}
		String output="";
		for(int i=0;i<num.length-1;i++){
			if(num[i+1]-num[i]==1){
				output="ascending";
			}
			else if(num[i+1]-num[i]==-1){
				output="descending";
			}
			else{
				output="mixed";
				break;
			}
		}
		System.out.println(output);
	}
}
