class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean bool=true;
        if(n<=0)
            return false;
        while(n>1){
            if((1 & n%2)!=0)
                bool=false;
            n=n/2;
        }
        return bool;
    }
}