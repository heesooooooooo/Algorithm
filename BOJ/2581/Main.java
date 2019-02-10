import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		boolean chk=false;
		int total=0;
		int min=n;
		
		for(int i=m;i<=n;i++){
			if(i==1){
				continue;
			}
			if(i==2){
				total+=2;
				min=2;
				continue;
			}
			for(int j=2;j<i;j++){
				if(i%j==0){
					chk=true;
					break;
				}
			}
			if(!chk){
				total+=i;
				if(min>i){
					min=i;
				}
			}
			else{
				chk=false;
			}
		}
		if(total==0){
			System.out.println("-1");
		}
		else{
			System.out.println(total);
			System.out.println(min);
		}
	}
}
