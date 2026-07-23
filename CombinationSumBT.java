class CombinationSumBT {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> current =new ArrayList<>();
        backTrack(0,candidates,target,current,answer);
        return answer;
    }
    protected void backTrack(int startInd , int[] candidates , int target , List<Integer> current,List<List<Integer>> answer) 
    {
        if(target==0)
        {
            answer.add(new ArrayList<>(current));
            return;
        }
        if(target<0)
        {
            return;
        }

        for(int i=startInd;i<candidates.length;i++)
        {
            current.add(candidates[i]);
            backTrack(i, candidates , target-candidates[i] , current , answer );
            current.remove(current.size()-1);  
        }
    }
}
