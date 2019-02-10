import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		int n;
		int l,r;
		while(t>0){
			n=Integer.parseInt(br.readLine());
			l=n/2;
			r=n/2;
			while(true){
				if(gold(l)&&gold(r)){
					break;
				}
				else{
					l--;
					r++;
				}
			}
			bw.write(l+" "+r+"\n");
			t--;
		}
		bw.flush();
		bw.close();		
	}
	public static boolean gold(int a){
		double root=Math.sqrt(a);
		for(int i=2;i<=root;i++){
			if(a%i==0){
				return false;
			}
		}
		return true;
	}
}
