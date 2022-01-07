class Solution {
    public boolean isPalindrome(int x) {
        String op="";
        String s=Integer.toString(x);
        for(int i=s.length()-1; i>=0; i--)
        {
            op=op+s.charAt(i);
        }
        if(op.equals(s))
        {
            return true;
        }
        return false;
    }
}