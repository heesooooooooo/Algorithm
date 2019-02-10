import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int[] num=new int[n];
		
		for(int i=0;i<n;i++){
			num[i]=Integer.parseInt(br.readLine());
		}
		
		countSort(num);
		
		for(int j=0;j<n;j++){
			bw.write(num[j]+"\n");
		}
		bw.flush();
		bw.close();
	}
	public static int findMax(int[] array){//배열에서 최댓값 찾기
		int temp=array[0];
		for(int i=1;i<array.length;i++){
			if(temp<array[i]){
				temp=array[i];
			}
		}
		return temp;
	}
	public static void countSort(int[] array) {
		int[] count=new int[findMax(array)+1];
        int[] sort = new int[array.length];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==0){
				count[0]++;
			}
			else{
				count[array[i]-1]++;
			}			
		}
		for(int i=1;i<count.length;i++) {
			count[i]=count[i-1]+count[i];
		}
		
		for(int i=array.length-1;i>=0;i--) {
			if(array[i]==0){
				sort[count[0]-1]=array[i];
				count[0]--;
			}
			else{
				sort[count[array[i]-1]-1]=array[i];		
				count[array[i]-1]--;
			}
			
		}
		
		System.arraycopy(sort, 0, array, 0, array.length);
		
	}
	
}
