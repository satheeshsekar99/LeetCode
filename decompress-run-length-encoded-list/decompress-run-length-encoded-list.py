class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        ans = []
        for i in range(0, len(nums), 2):
            freq = nums[i]
            value = nums[i+1]
            ans = ans + freq * [value]
        return ans
        