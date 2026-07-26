class RotateImage2D {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int i,j;
        int tmp;
        int temp;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(i=0;i<n;i++)
        {
            int left=0,right=n-1;
            while(left<right)
            {
                tmp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=tmp;
                left++;
                right--;
            }
        }
    }
}
