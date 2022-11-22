class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> h=new HashSet<>();
        for(String i:wordDict)
            h.add(i);
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<=i;j++){
                if(dp[j]==true){
                    if(h.contains(s.substring(j,i))){ 
                       dp[i]=true;
                       break;
                    }
                }
            }
        }
        return dp[dp.length-1];
    }
}