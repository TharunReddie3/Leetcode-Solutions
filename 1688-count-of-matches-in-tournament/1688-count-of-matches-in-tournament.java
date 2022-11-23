class Solution {
    public int numberOfMatches(int n) {
        int c=0;
        while(n!=0){
            if(n%2==0)
                c+=n/2;
            else
                c+=(n-1)/2 +1;
            n=n/2;
        }
        return c-1;
    }
}