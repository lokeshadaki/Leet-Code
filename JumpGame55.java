class JumpGame55 {
    public boolean canJump(int[] nums) {
        int jmp=0,currentend=0,farthest=0,i;
        for(i=0;i<nums.length;i++)
        {
            if(i>farthest)
            {
                return false;
            }
            farthest=Math.max(farthest,i+nums[i]);
            if(farthest>=nums.length-1)
            {
                return true;
            }
        }
        return true;
    }
}
