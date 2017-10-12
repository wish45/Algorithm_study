package If;

import java.util.*;

public class if_1110 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		
		sc.close();
		int count=0;
		int NEW=N;
	while(true) {
			int a=N/10;
			int b=N%10;
			int c=a+b;
			N=b*10+(c%10);
	
			count=count+1;
			if(N==NEW)  
				break;
			
		
		}
	System.out.println(count);
	}
}
