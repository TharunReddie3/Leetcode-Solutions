class Solution {
    public String restoreString(String s, int[] indices) {
        String str="";
        int j=0;
        for(int i=0;i<indices.length;i++){
            for(int k=0;k<indices.length;k++){
                if(indices[k]==j)
                    str=str+s.charAt(k);
            }
            j++;
        }
        return str;
    }
}