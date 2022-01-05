class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Scanner sc=new Scanner(System.in);
        // String[] strs=new String[]{"flower", "flow", "flight"};
        int i=0;
        int j=0;
//        System.out.println("enter strs");
//        for(i=0; i<3; i++)
//        {
//            strs[i]=sc.next();
//        }
        int minlength = strs[0].length();
        for(i=1; i<strs.length; i++)
        {
            if(strs[i].length()<minlength)
            {
                minlength = strs[i].length();
            }
        }
        String result="";
        char current;
        for(i=0; i<minlength; i++)
        {
            current=strs[0].charAt(i);
            for(j=1; j<strs.length; j++)
            {
                if(current!=strs[j].charAt(i))
                {
                    return result;
                }
            }
            result = result+current;
        }
        return result;
    }
}