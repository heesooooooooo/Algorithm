import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		HashSet<String> hs=new HashSet<>();
		
		for(int i=0;i<n;i++){
			hs.add(br.readLine());
		}
		String str[]=new String[hs.size()];
		hs.toArray(str);
		Arrays.sort(str);
		
		
		Arrays.sort(str,new Comparator<String>(){
			public int compare(String s1,String s2){
				return Integer.compare(s1.length(), s2.length());
			}
		});
		

		for(int j=0;j<str.length;j++){
			bw.write(str[j]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
