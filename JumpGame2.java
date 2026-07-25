class JumpGame2 {
    public int jump(int[] nums) {
        int jmp=0,currentEnd=0,farthest=0,i;
        for(i=0;i<nums.length-1;i++)
        {
            farthest=Math.max(farthest,i+nums[i]);
            if(i==currentEnd) 
            {
                jmp++;
                currentEnd=farthest;
            }
        }
        return jmp;
    }
}
