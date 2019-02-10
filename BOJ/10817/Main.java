import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s[]=br.readLine().split(" ");
		int num[]=new int[3];
		
		for(int i=0;i<num.length;i++){
			num[i]=Integer.parseInt(s[i]);	
		}
		Arrays.sort(num);
		bw.write(num[1]+"\n");
		bw.flush();
		bw.close();
		
	}
}
