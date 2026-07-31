class UniquePath2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int row,col;
        if(obstacleGrid[0][0]==1)
        {
            return 0;
        }
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        for(row=1;row<m;row++)
        {
            if(obstacleGrid[row][0]==1)
            {
                dp[row][0]=0;
            }
            else
            {
                dp[row][0]=dp[row-1][0];
            }
        }

        for(col=1;col<n;col++)
        {
            if(obstacleGrid[0][col]==1)
            {
                dp[0][col]=0;
            }
            else
            {
                dp[0][col]=dp[0][col-1];
            }
        }

        for(row=1;row<m;row++)
        {
            for(col=1;col<n;col++)
            {
                if(obstacleGrid[row][col]==1)
                {
                    dp[row][col]=0;
                }
                else
                {
                    dp[row][col]= dp[row-1][col]+dp[row][col-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
