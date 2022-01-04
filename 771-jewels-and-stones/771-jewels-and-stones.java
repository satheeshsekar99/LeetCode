class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int op=0;
        int i = 0,j=0;
        // System.out.println("Enter Jwells");
        // String jwell =sc.next();
        // System.out.println("Enter Stones");
        // String stones =sc.next();
        for(i=0; i<stones.length(); i++)
        {
            for(j=0; j<jewels.length(); j++)
            {
                if(stones.charAt(i)==jewels.charAt(j))
                {
                    op = op+1;
                }
            }
        }
        return op;
    }
}