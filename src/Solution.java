
public class Solution {

	public String mixword(String word1,String word2) {
		int s1len = word1.length();
        int s2len =word2.length();
        int maxlength = (s1len>s2len?s1len:s2len);
        StringBuilder res = new StringBuilder();
        
        int i = 0;
            while(i < maxlength){
                if(i<s1len){ 
                    res.append(word1.charAt(i));
                }else{
                    for(int j=i;j<s2len;j++){
                        res.append( word2.charAt(j));
                    }
                    break;
                }
                if(i<s2len){ 
                    res.append(word2.charAt(i));
                }else{
                    for(int j=i+1;j<s1len;j++){
                        res.append(word1.charAt(j));
                    }
                    break;
                }
                i++;
            }
        return res.toString();
	}
}
	
