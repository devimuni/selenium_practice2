package stringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Stringremoveduplicates {

	public static void main(String[] args) {
		
		String s1="aaabbbccc";
		
		
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new LinkedHashSet();
		for(int i= 0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
			
		}
		
		for(Character c: set)
		{
			
			sb.append(c);
		}
		
		System.out.println(sb);
		
		
	}

}
