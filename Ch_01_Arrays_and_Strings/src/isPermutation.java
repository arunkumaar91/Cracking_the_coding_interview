import java.util.*;

public class isPermutation {
	public static boolean checkPermutation(String s1, String s2){
		if (s1.length() != s2.length()) {
			return false;
		}
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}

	public static void main(String[] args) {
		String[][] pairs = {{"apple", "elppa" },{"hello", "olleh"}, {"kite", "etik"}};
		
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = checkPermutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ":"  + anagram);
		}
	}
}
