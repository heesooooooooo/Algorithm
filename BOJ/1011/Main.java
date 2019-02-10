import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		int x,y;
		int k1,k2,k3;
		int m1,m2,m3;
		int n=0;
		
		for(int i=0;i<t;i++){
			x=input.nextInt();
			y=input.nextInt();
			int cnt=0;
			while(x<y){
				k1=n-1;
				k2=n;
				k3=n+1;
				m1=y-(x+k1);
				m2=y-(x+k2);
				m3=y-(x+k3);
				if(x+k1==y||x+k2==y||x+k3==y){
					x+=1;
					n=1;
				}
				else{
					if(m1<m2&&m1<m3){
						x+=k1;
						n=k1;
					}
					else if(m2<m1&&m2<m3){
						x+=k2;
						n=k2;
					}
					else{
						x+=k3;
						n=k3;
					}
				}
				cnt++;
			}
			System.out.println(cnt);
		}
		
	}
}
