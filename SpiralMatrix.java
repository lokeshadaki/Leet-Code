class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,left=0;
        int bottom=matrix.length-1;
        int right=matrix[top].length-1;
        List<Integer> answer=new ArrayList<>();

        while(top<=bottom && left<=right)
        {
            //left to right
            for(int col=left;col<=right;col++)
            {
                answer.add(matrix[top][col]);
            }
            top++;

            //top to bottom
            for(int row=top;row<=bottom;row++)
            {
                answer.add(matrix[row][right]);
            }
            right--;

            if(top<=bottom)
            {
                // right to left
                for(int col=right;col>=left;col--)
                {
                    answer.add(matrix[bottom][col]);
                }
                bottom--;
            }

            if(left<=right)
            {
                // bottom to top
                for(int row=bottom;row>=top;row--)
                {
                    answer.add(matrix[row][left]);
                }
                left++;
            }
        }
        return answer;
    }
}
