class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        for (int i=0; i<numbers.length; i++)
        {
            if(numbers[l]+numbers[r]==target)
            {
                return new int[]{l+1,r+1};
            }
            else if (numbers[l]+numbers[r]<target)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return null;
    }
}