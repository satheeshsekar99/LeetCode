class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        op =0
        for i in jewels:
            for j in stones:
                if i == j:
                    op +=1
        return op