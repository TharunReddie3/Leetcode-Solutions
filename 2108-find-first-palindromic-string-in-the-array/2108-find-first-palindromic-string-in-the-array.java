class Solution {
    public String firstPalindrome(String[] words) {
        String w[]=new String[words.length];
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(words[i]);
            sb.reverse();
            w[i]=sb.toString();
        }
        for(int i=0;i<words.length;i++)
            if(words[i].equals(w[i]))
                return words[i];
        return "";
    }
}