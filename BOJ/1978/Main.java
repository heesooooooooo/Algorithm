import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int now;
		int count=0;
		
		boolean chk=false;
		
		for(int i=0;i<n;i++){
			now=input.nextInt();
			if(now==1){
				continue;
			}
			for(int j=2;j<now;j++){
				if(now%j==0){
					chk=true;
					break;
				}
			}
			if(!chk){
				count++;
			}
			chk=false;
		}
		System.out.println(count);
	}
}
