import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		int x,y;
		x=input.nextInt();
		y=input.nextInt();
		
		for(int i=1;i<x;i++){
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
				y+=31;
			}
			else if(i==4||i==6||i==9||i==11){
				y+=30;
			}
			else{
				y+=28;
			}
		}
		y=y%7;
		
		switch(y){
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
		
	}
		
	}
}
