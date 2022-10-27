class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ar[]=new int[2];
        int top=0,end=numbers.length-1;
        while(numbers[top]+numbers[end]!=target){
            if(numbers[top]+numbers[end]<target)
                top++;
            else
                end--;
        }
        ar[0]=top+1;
        ar[1]=end+1;
        return ar;
    }
}