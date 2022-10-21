class Solution {
    public int[] plusOne(int[] digits) {
        int sum=0,carry=1;
        for(int i=digits.length-1;i>=0;i--){
            sum=digits[i]+carry;
            digits[i]=sum%10;
            carry=sum/10;
        }
        if(carry!=0){
            int arr[]=new int[digits.length+1];
            arr[0]=carry;
            int j=1;
            for(int i=0;i<digits.length;i++){
                arr[j]=digits[i];
                j++;
            }
            return arr;
        }
        return digits;
    }
}