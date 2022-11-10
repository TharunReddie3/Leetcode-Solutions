class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()==s.charAt(i)){
                st.pop();
            }
            else
              st.push(s.charAt(i));
        }
        String str="";
        for(int i=0;i<st.size();i++)
            str=str+st.get(i);
        return str;
    }
}