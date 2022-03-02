class Solution {
    public int pivotIndex(int[] nums) {
        int sum[] = new int[nums.length];
        sum[0] = nums[0];
        for(int i=1; i< nums.length; i++)
        {
            sum[i] = nums[i] + sum[i-1];
        }
        if(sum[sum.length-1]-sum[0]==0)
        {
            return 0;
        }
        for(int i=1; i<sum.length; i++)
        {
            if(sum[i-1] == (sum[sum.length-1]-sum[i]))
            {
                return i;
            }
        }
        return -1;
    }
}