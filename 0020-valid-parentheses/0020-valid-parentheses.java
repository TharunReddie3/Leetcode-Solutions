class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && (s.charAt(i)-st.peek()==2 || s.charAt(i)-st.peek()==1))
                st.pop();
            else
                st.push(s.charAt(i));
        }
        if(st.isEmpty())
            return true;
        return false;
    }
}