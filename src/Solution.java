
public class Solution {

	public String mixword(String word1,String word2) {
	        int i=0;
	        int m = word1.length();
	        int j = 0;
	        int n = word2.length();
	        StringBuilder res = new StringBuilder();
	        while(i<m && j<n){
	            res.append(word1.charAt(i)).append(word2.charAt(i));
	            i++;
	            j++;
	        }
	        
	        
	        while(i<m){
	            res.append(word1.charAt(i));
	            i++;
	        }
	        while(j<n){
	            res.append(word2.charAt(j));
	            j++;
	        }
	        return res.toString();
		
	}

	public String stringCommonDivisor(String str1, String str2) {
		
		String divisor ="";
		
		for(int i = str2.length(); i>0; i--) {
			 divisor = str2.substring(0, i);
			 if( str1.split(divisor).length<=0 && str2.split(divisor).length<=0) {
				 return divisor;
			 }
		}
		return "";
	}
}
	
