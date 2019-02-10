import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Character> st=new Stack<>();
		int n=Integer.parseInt(br.readLine());
		String str;
		char ch;
		
		while(n>0){
			str=br.readLine();
			for(int i=0;i<str.length();i++){
				ch=str.charAt(i);
				if(ch=='('){
					st.push(ch);
				}
				else{
					if(st.isEmpty()){
						bw.write("NO\n");
						break;
					}
					else{
						st.pop();						
					}					
				}
				if(i==str.length()-1){
					if(st.isEmpty()){
						bw.write("YES\n");
					}
					else{
						bw.write("NO\n");
					}
				}
			}
			
			st.clear();
			n--;
		}
		bw.flush();
		bw.close();
	}
}
