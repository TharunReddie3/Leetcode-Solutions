class Solution {
    public int titleToNumber(String columnTitle) {
        int num=0;
        for(int i=0;i<columnTitle.length();i++){
            num=26*num+(columnTitle.charAt(i)-64);
        }
        return num;
    }
}