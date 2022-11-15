class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=n,i=0,k=0;
        int a[]=new int[nums.length];
        while(i<nums.length && j<nums.length){
            a[i]=nums[k++];
            a[i+1]=nums[j];
            j++;
            i=i+2;
        }
        return a;
    }
}