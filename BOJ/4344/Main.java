import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int c=input.nextInt();
		for(int i=0;i<c;i++){
			int n=input.nextInt();
			int array[]=new int[n];
			double avg=0;
			double d=0;
			for(int j=0;j<n;j++){
				array[j]=input.nextInt();
				avg+=array[j];
			}
			avg=avg/n;
			for(int k=0;k<n;k++){
				if(array[k]>avg){
					d++;
				}
			}
			d=d/n*100;
			String s=String.format("%.3f", d);
			System.out.println(s+"%");
		}
	}
}
