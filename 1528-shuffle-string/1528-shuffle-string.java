class Solution {
    public String restoreString(String s, int[] indices) {
                // String s = "codeleet";
        // int[] indices=new int[]{4,5,6,7,0,2,1,3};
        char ch[] = new char[indices.length];
        for(int i=0; i<s.length(); i++)
        {
            ch[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ch);
    }
}