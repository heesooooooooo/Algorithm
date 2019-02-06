import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str=br.readLine();
		ArrayList<Integer> num=new ArrayList<>();
		for(int i=0;i<str.length();i++){
			num.add(Integer.parseInt(String.valueOf(str.charAt(i))));
		}
		Collections.sort(num);
		Collections.reverse(num);
		
		for(int j=0;j<num.size();j++){
			bw.write(num.get(j)+"");
		}
		bw.write("\n");
		bw.flush();
		bw.close();
	}
}
