class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s="";
        String st="";
        for(int i=0;i<word1.length;i++)
            s=s+word1[i];
        for(int i=0;i<word2.length;i++)
            st=st+word2[i];
        return s.equals(st);
    }
}