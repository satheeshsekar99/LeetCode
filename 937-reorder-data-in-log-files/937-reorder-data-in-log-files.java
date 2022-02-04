class Solution {
    public String[] reorderLogFiles(String[] logs) {
            Comparator<String> mycomp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] s1 = o1.split(" ", 2);
                String[] s2 = o2.split(" ", 2);

                boolean isDig1 = Character.isDigit(s1[1].charAt(0));
                boolean isDig2 = Character.isDigit(s2[1].charAt(0));

                if(!isDig1 && !isDig2)
                {
                    int comp = s1[1].compareTo(s2[1]);
                    if(comp!=0)
                    {
                        return comp;
                    }
                    else
                    {
                        return s1[0].compareTo(s2[0]);
                    }
                }
                else if(!isDig1 && isDig2)
                {
                    return -1;
                }
                else if(isDig1 && !isDig2)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }

        };
        Arrays.sort(logs, mycomp);
        return logs;
        
    }
}