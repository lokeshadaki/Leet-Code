class RemoveDuplicationSortrdFromArray {
    public int removeDuplicates(int[] nums) {
        int i=0,j;
       
        if(nums.length==1)
        {
            return 1;
        }

        for(j=1 ;j<nums.length ; j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }   
        }
        return i+1;
    }
}
