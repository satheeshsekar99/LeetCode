class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int k=0;
        int N = mat.length;
        int M = mat[0].length;
        int[] res = new int[N*M];
        ArrayList<Integer> intermediate = new ArrayList<>();
        for(int d=0; d<N+M-1; d++)
        {
            intermediate.clear();

            int r = d<M ? 0 : d-M+1;
            int c = d<M ? d : M-1;

            while(r<N && c>-1)
            {
                intermediate.add(mat[r][c]);
                r++;
                c--;
            }

            if(d%2==0)
            {
                Collections.reverse(intermediate);
            }

            for(int i=0; i<intermediate.size(); i++)
            {
                res[k] = intermediate.get(i);
                k++;
            }
        }
        return res;
    }
}