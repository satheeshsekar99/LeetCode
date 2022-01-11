class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N=9;

        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] columns = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for(int r=0; r<N; r++)
        {
            rows[r] = new HashSet<Character>();
            columns[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for(int r=0; r<N; r++)
        {
            for(int c=0; c<N; c++)
            {
                Character num = board[r][c];

                if(num == '.')
                {
                    continue;
                }

                if(rows[r].contains(num))
                {
                    return false;
                }
                rows[r].add(num);

                if(columns[c].contains(num))
                {
                    return false;
                }
                columns[c].add(num);

                int bx = ((r/3)*3)+(c/3);
                if(boxes[bx].contains(num))
                {
                    return false;
                }
                boxes[bx].add(num);
            }
        }
        return true;
    }
}