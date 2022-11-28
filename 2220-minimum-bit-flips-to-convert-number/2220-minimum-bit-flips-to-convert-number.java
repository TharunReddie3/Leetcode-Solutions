class Solution {
    public int minBitFlips(int start, int goal) {
        int n=start^goal;
        int c=0;
        while(n!=0){
            if((n%2 & 1)==1)
                c++;
            n=n/2;
        }
        return c;
    }
}