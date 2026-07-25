class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        backTrack(nums,answer,current,used);
        return answer;
    }

    public void backTrack(int nums[],List<List<Integer>> answer,List<Integer> current,boolean used[])
    {
        if(current.size()==nums.length)
        {
            answer.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i]==true)
                continue;
            
            if(i>0 && nums[i]==nums[i-1] && used[i-1]==false)
                continue;
            
            used[i]=true;
            current.add(nums[i]);
            backTrack(nums,answer,current,used);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}
