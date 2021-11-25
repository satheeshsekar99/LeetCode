class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        encoded.insert(0, first)
        for i in range(1, len(encoded)):
            encoded[i] = first ^ encoded[i]
            first = encoded[i]
        return encoded

        