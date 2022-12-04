class Solution {
    public String reversePrefix(String word, char ch) {
        String s="";
        int j=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                s=word.substring(0,i+1);
                j=i;
                break;
            }
        }
        System.out.println(s);
        if(j==-1)
            return word;
        String str="";
        for(int i=0;i<s.length();i++){
            str=s.charAt(i)+str;
        }
        for(int i=j+1;i<word.length();i++)
            str=str+word.charAt(i);
        return str;
    }
}