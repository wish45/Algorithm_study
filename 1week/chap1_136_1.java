package Coding_Interview;

import java.util.*;

class method{

	boolean isUniqueChars(String str){
		if(str.length()>128) { 
			return false;
		}
		boolean[] char_set=new boolean[128];
		for(int i=0; i<str.length(); i++) {
			int val = str.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val]=true;
		}
		return true;
	}
}
public class chap1_136_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		method mymy = new method();
		boolean abc=mymy.isUniqueChars(sc.nextLine());
		System.out.println(abc);
//		String RandomString=sc.nextLine();
//		String[] array=new String[RandomString.length()];
//		String array2[]= RandomString;
//		
//		for(int i=0; i<RandomString.length();i++) {
//			for(int j=i+1;j<RandomString.length();j++) {
//				
//			}
//		}
//		
		
	}
}


