package Coding_Interview;

import java.util.*;

public class chap2_142_2_6 {
	public static void main(String args[]) {
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();		

		for(int i=0; i<(input.length()/2);i++) {
			
			if(input.charAt(i) != input.charAt(input.length()-i-1)) { //반갈라서 처번째와 마지막 비교
				flag = false;
			}
		}
		if(flag==true)
			System.out.println("회문입니다");
		else if(flag==false)
			System.out.println("회문이아닙니다");
	}
	
}









