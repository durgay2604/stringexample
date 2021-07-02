package com.ver.java.string;

public class StringMerge {

	public static void main(String[] args) {
		String s1="abc";
		String s2="xyz";
		
		String result = merge(s1,s2);
		
		System.out.print(result);
	}

	private static String merge(String s1, String s2) {
		if(s1==null && s2==null) {
			return "";
		}else if(s1==null) {
			return s2;
		}else if(s2==null) {
			return s1;
		}
		
		StringBuilder sb = new StringBuilder();
		
		int l1= s1.length();
		int l2 = s2.length();
		
		for(int i=0;i<s1.length() && i< s2.length(); i++) {
			sb.append(s1.charAt(i));
			sb.append(s2.charAt(i));
		}
		if(l1>l2) {
			sb.append(s1.substring(l2));
		}
		if(l2>l1) {
			sb.append(s2.substring(l1));
		}
		return sb.toString();
	}

}
