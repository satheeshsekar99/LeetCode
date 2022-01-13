class Solution {
        private Map<Character, Integer> countsMap(String st){
        Map<Character, Integer> counts = new HashMap<>();
        for(char c : st.toCharArray())
        {
            int CurrentCount = counts.getOrDefault(c, 0);
            counts.put(c, CurrentCount+1);
        }
        return counts;
    }
    
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sCount = countsMap(s);
        Map<Character, Integer> tCount = countsMap(t);

        if(s.length()!=t.length())
        {
            return false;
        }

        for(char c : sCount.keySet())
        {
            int InS = sCount.getOrDefault(c, 0);
            int InT = tCount.getOrDefault(c, 0);
            if(InS != InT)
            {
                return false;
            }
        }
        return true;
    }
}