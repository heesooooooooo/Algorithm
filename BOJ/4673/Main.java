public class Main {
	public static void main(String[] args){
		boolean chk[]=new boolean[10001];
		
		for(int i=1;i<chk.length;i++){
			d(i,chk);
		}
		for(int i=1;i<chk.length;i++){
			if(!chk[i]){
				System.out.println(i);
			}
		}
		
	}
	public static void d(int i,boolean chk[]){
		int dn=i;
		int temp=0;
		while(true){
			temp+=dn;
			temp+=dn/1000;
			dn=dn%1000;
			temp+=dn/100;
			dn=dn%100;
			temp+=dn/10+dn%10;
			dn=temp;
			if(dn>10000){
				break;
			}
			chk[dn]=true;
			temp=0;
		}
		
	}
}
