class GenerateParenthese {
    public List<String> generateParenthesis(int n) {
        List<String> answer=new ArrayList<>();

        Generate(answer,"", 0 , 0 ,n);
        return answer;
    }

    protected void Generate(List<String> answer ,String current , int open , int close , int n)
    {
        if((open + close == 2*n) )
        {
            answer.add(current);
            return ;
        }

        if(open < n)
        {
            Generate(answer,current+'(', open +1 , close, n);
        }
        if(close < open)
        {
            Generate(answer,current+')', open  , close+1 , n);
        }
    }
}
