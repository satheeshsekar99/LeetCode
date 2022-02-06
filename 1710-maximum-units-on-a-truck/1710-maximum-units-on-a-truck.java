class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int maxUnits = 0;
        Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
        for(int[] boxIndex : boxTypes)
        {
            int boxCount = Math.min(boxIndex[0], truckSize);
            maxUnits += boxCount*boxIndex[1];
            truckSize -= boxCount;
            if(truckSize==0)
            {
                break;
            }
        }
        return maxUnits;
    }
}