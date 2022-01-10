class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i : (nums1.length<nums2.length? nums1:nums2))
        {
            if(hmap.containsKey(i))
            {
                hmap.put(i, hmap.get(i) + 1);
            }
            else
            {
                hmap.put(i,1) ;
            }
        }
        for(int i : (nums1.length<nums2.length? nums2:nums1))
        {
            if(hmap.containsKey(i) && hmap.get(i)>0)
            {
                result.add(i);
                hmap.put(i, hmap.get(i) - 1);
            }
        }
        return (result.stream().mapToInt(i -> i).toArray());

    }
}