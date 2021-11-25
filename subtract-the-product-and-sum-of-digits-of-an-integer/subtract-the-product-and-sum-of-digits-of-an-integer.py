class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        pdt = 1
        sum = 0
        for i in str(n):
            pdt = pdt * int(i)
            sum = sum + int(i)
            ans = pdt - sum
        return ans
        