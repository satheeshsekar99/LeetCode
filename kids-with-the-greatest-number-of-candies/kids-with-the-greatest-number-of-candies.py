class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        x = []
        for i in candies:
            if i+extraCandies >= max(candies):
                x.append(bool(i+extraCandies >= max(candies)))
                #print('true')
            else:
                x.append(bool(i+extraCandies >= max(candies)))
                #print(x)
        return x
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        