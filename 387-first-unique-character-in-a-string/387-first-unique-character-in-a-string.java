class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> result = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            result.put(c, result.getOrDefault(c, 0)+1);
        }

        for (int i=0; i<s.length(); i++)
        {
            if(result.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }
}