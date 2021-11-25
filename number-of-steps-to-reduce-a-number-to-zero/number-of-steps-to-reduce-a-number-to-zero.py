class Solution:
    def numberOfSteps(self, num: int) -> int:
        count = 0
        while num>0:
            if num % 2 == 0:
                x = num/2
                num = x
                count +=1
            else:
                num = num-1
                count = count+1
        return count