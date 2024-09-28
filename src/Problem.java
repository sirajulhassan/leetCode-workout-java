
public class Problem {

	public static void main(String[] args) {

		Solution soln = new Solution();
		
		//Prob [1]
		/*
		 * You are given two strings word1 and word2. Merge the strings by adding
		 * letters in alternating order, starting with word1. If a string is longer than
		 * the other, append the additional letters onto the end of the merged string.
		 * 
		 * Return the merged string.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: word1 = "abc", word2 = "pqr" Output: "apbqcr" Explanation: The merged
		 * string will be merged as so: word1: a b c word2: p q r merged: a p b q c r
		 */
		
		System.out.println("[1] mixword problem Answer:["+ soln.mixword( "abcd","pq")+"]");
		
		//Prob [2]
		/*
		 * 1071. Greatest Common Divisor of Strings Easy Topics Companies Hint For two
		 * strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t
		 * + t (i.e., t is concatenated with itself one or more times).
		 * 
		 * Given two strings str1 and str2, return the largest string x such that x
		 * divides both str1 and str2.
		 * 
		 * Example 1:
		 * 
		 * Input: str1 = "ABCABC", str2 = "ABC" Output: "ABC" Example 2:
		 * 
		 * Input: str1 = "ABABAB", str2 = "ABAB" Output: "AB" Example 3:
		 * 
		 * Input: str1 = "LEET", str2 = "CODE" Output: ""
		 */
		
		System.out.println("Prob [2] stringCommonDivisor problem Answer:["+ soln.stringCommonDivisor( "TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX")+"]");
		

	}

}
