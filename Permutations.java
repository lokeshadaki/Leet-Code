class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        backTrack(nums,answer,current,used);
        return answer;
    }

    protected void backTrack(int[] nums,List<List<Integer>> answer,List current,boolean[] used)
    {
        if(current.size()==nums.length)
        {
            answer.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if (used[i]==true)
                continue;
            
            used[i]=true;
            current.add(nums[i]);
            backTrack(nums,answer,current,used);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}
