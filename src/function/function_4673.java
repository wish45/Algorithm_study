package function;

import java.util.*;

public class function_4673 {
	
	public static int selfNum(int N) {
		int total=0; 
		int num=0;
		
		if(N>=10000) {
			num=num+(N/10000);
			N=N%10000;
		}else if(N>=1000) {
			num=num+(N/1000);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int N;
		
		Scanner sc = new Scanner(System.in);
		 N =sc.nextInt();
		
		selfNum(N);
		System.out.println(N);	
//		int[] array = new int[10000];
//		
//		
//		for(int i=0; i<10000;i++) {
//			array[i]=num;
//		}
	}

}








