package Coding_Interview;

import java.util.*;

public class chap2_142_2_6 {
	public static void main(String args[]) {
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();		

		for(int i=0; i<(input.length()/2);i++) {
			
			if(input.charAt(i) != input.charAt(input.length()-i-1)) { //�ݰ��� ó��°�� ������ ��
				flag = false;
			}
		}
		if(flag==true)
			System.out.println("ȸ���Դϴ�");
		else if(flag==false)
			System.out.println("ȸ���̾ƴմϴ�");
	}
	
}









