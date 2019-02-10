import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		String result[]=new String[t];
		
		for(int i=0;i<t;i++){
			int h=input.nextInt();
			int w=input.nextInt();
			int n=input.nextInt();
	
			String floor=String.valueOf(n%h);
			String room=String.valueOf(n/h+1);
			
			
			if(floor.equals("0")){
				floor=String.valueOf(h);
				room=String.valueOf(n/h);
			}			
			if(room.length()==1){
				room="0"+room;
			}
			result[i]=floor+room;
		}
		for(int i=0;i<t;i++){
			System.out.println(result[i]);
		}
	}
}
