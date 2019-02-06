import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		boolean chk=false;
		
		for(int i=m;i<=n;i++){
			if(i==1){
				continue;
			}
			if(i==2){
				System.out.println("2");
				continue;
			}
			double root=Math.sqrt(i);
			for(int j=2;j<=root;j++){
				if(i%j==0){
					chk=true;
					break;
				}
			}
			if(!chk){
				System.out.println(i);
			}
			chk=false;
		}
	}
}
