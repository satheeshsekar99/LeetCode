class Solution {
    public int lengthOfLastWord(String s) {
        String op[] = s.split(" ");
        int full = op.length;
        int res = op[full-1].length();
        return res;
    }
}