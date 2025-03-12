package Array;

public class Palindrome {
	public static void main(String[] args) {
		String s = "gadag is beautiful city";
		String[] words = s.split(" ");
		for (String word : words) {
			if (isPalindrome(word)) {
				System.out.println("Palindromes in the given string("+s+") is : "+word);
			}
		}
	}

	public static boolean isPalindrome(String word) {
		int left = 0;
		int right = word.length() - 1;

		while (left < right) {
			if (word.charAt(left) != word.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
