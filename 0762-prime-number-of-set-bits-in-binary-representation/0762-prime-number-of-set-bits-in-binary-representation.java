class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        while(left<=right){
            int d=0;
            int j=setbits(left);
            if(j==1)
                d=-1;
            for(int i=2;i<j;i++){
                if(j%i==0){
                    d=-1;
                    break;
                }
            }
            if(d==0)
                c++;
            left++;
        }
        return c;
    }
    public static int setbits(int n){
        int c=0;
        while(n>0){
            if((n%2 & 1)==1)
                c++;
            n=n/2;
        }
        return c;
    }
}