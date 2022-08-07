class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] arr = new int[2*len];
        for(int i=0 ; i<arr.length ; i++){
            if(i<len)
                arr[i]=nums[i];
            else
                arr[i]=nums[i-len];
        }
        return arr;
    }
}