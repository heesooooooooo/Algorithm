import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++){
			num[i]=input.nextInt();
		}
		
		Arrays.sort(num);
		
		for(int i=0;i<n;i++){
			System.out.println(num[i]);
		}
	}
}
