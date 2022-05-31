class Solution {
    public void reverseString(char[] s) {
        int j=s.length -1;
        HashMap<Integer,Character> h = new HashMap<>();
        for(int i=0;i<s.length;i++)
            h.put(i,s[i]);
        for(int i=0;i<h.size();i++){
            s[j]=h.get(i);
            j--;
        }
        for(int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }
}