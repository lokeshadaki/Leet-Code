class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int left=0, right=n-1, top=0, bottom=n-1, num=1;
        while(top<=bottom && left<=right)
        {
            for(int col=left;col<=right;col++)
            {
                matrix[top][col]=num;
                num++;
            }
            top++;

            for(int row=top;row<=bottom;row++)
            {
                matrix[row][right]=num;
                num++;
            }
            right--;

            if(top<=bottom)
            {
                for(int col=right;col>=left;col--)
                {
                    matrix[bottom][col]=num;
                    num++;
                }
                bottom--;
            }

            if(left<=right)
            {
                for(int row=bottom;row>=top;row--)
                {
                    matrix[row][left]=num;
                    num++;
                }
                left++;
            }
        }

        return matrix;
    }
}
