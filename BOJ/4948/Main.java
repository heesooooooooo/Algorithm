import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int cnt=0;
		double root;
		boolean chk=false;
		
		while(true){
			n=Integer.parseInt(br.readLine());
			root=Math.sqrt(2*n);
			if(n==0){
				break;
			}
			for(int i=n+1;i<=2*n;i++){
				if(i==1){
					continue;
				}
				if(i==2){
					cnt++;
					continue;
				}
				for(int j=2;j<=root;j++){
					if(i%j==0){
						chk=true;
						break;
					}
				}
				if(!chk){
					cnt++;
				}
				chk=false;
			}
			System.out.println(cnt);
			cnt=0;
		}
		
	}
}
