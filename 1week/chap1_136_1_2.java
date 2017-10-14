package Coding_Interview;

import java.util.*;

class sortmethod{
	public String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public boolean permutation(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}	
}
public class chap1_126_1_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		sortmethod instance = new sortmethod();
		instance.sort(str1);
		instance.sort(str2);
		boolean a=instance.permutation(str1,str2);
		System.out.println(a);
	}
}
