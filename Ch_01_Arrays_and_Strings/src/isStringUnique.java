import java.util.HashSet;

//import java.util.*;
public class isStringUnique {
	public static boolean isCharUnique(String str) {
		HashSet<Character> unique = new HashSet<Character>();
		for(int i=0;i<str.length();i++) {
			unique.add(str.charAt(i));
		}
		if(unique.size() != str.length())
		{
			return false;
		}
		else
			return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isCharUnique(word));
		}
	}
}
