class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> answer=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer> row=new ArrayList<>();
            row.add(1);
            
            if(i>1)
            {
                List<Integer> prev=answer.get(i-1);
                for(int j=1;j<i;j++)
                {
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            
            if(i>0)
            {
                row.add(1);   
            }
            answer.add(row);
        }
        return answer.get(rowIndex);
    }
}
