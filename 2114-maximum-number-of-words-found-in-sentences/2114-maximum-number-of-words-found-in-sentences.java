import java.util.*;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            StringTokenizer st=new StringTokenizer(sentences[i]+""," ");
            int j=st.countTokens();
            max=Math.max(max,j);
        }
        return max;
    }
}