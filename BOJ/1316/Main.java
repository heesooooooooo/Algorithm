import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++){
			str[i]=input.next();			
		}
		input.close();
		
		int result=n;
		for(int i=0;i<n;i++){
			boolean alpha[]=new boolean[26];
			String word=str[i];
			for(int j=1;j<word.length();j++){
				if(word.charAt(j-1)!=word.charAt(j)){
					if(alpha[word.charAt(j)-97]){
						result--;
						break;
					}
					alpha[word.charAt(j-1)-97]=true;					
				}
			}
		}
		System.out.println(result);
	}
}
