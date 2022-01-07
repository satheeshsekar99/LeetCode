class Solution {
    public int romanToInt(String s) {
                int sum=0;
        char c[] = s.toCharArray();

        for (int i=0; i<c.length; i++)
        {
            switch (c[i])
            {
                case 'M':
                    sum += 1000;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'I':
                    sum += 1;
                    break;
            }
            if (i!=0 && c[i-1]=='I' && (c[i]=='V' || c[i]=='X'))
            {
                sum -=2;
            }
            if (i!=0 && c[i-1]=='X' && (c[i]=='L' || c[i]=='C'))
            {
                sum -=20;
            }
            if (i!=0 && c[i-1]=='C' && (c[i]=='D' || c[i]=='M'))
            {
                sum -=200;
            }
        }
        return sum;
    }
}