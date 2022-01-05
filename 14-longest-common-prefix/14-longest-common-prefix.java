class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        int minLength = findMin(strs);

        while(index < minLength) {
            if(!checkCharAt(strs, index)) {
                break;
            }
            index++;
        }

        return strs[0].substring(0,index);
    }
        public int findMin(String[] strs) {
        int minLength = strs[0].length();
        for(int i =1; i<strs.length;i++) {
            if(strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        return minLength;
    }

    public boolean checkCharAt(String[] strs, int index) {
        char check = strs[0].charAt(index);
        //boolean flag = true;
        for(int i =1; i< strs.length; i++) {
            if(strs[i].charAt(index) != check) {
				/*flag = false;
				break;*/
                return false;
            }
        }
        return true;
    }
}