class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> mylist = new ArrayList<Integer>();
        for(int r=0; r<m; r++)
        {
            for(int c=0; c<n; c++)
            {
                if(matrix[r][n-1]>=target || n==1)
                {
                    mylist.add(matrix[r][c]);
                }
            }
        }
        if(mylist.contains(target))
        {
            return true;
        }
        return false;
    }
}