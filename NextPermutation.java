class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pivot=i;
                break;
            }
        }
        if(pivot==-1)
        {
           reverse(nums,0,nums.length-1);
           return;
        }
        for(int j=n-1; j> pivot; j--)
        {
            if(nums[j] > nums[pivot])
            {
                int temp=nums[j];
                nums[j]=nums[pivot];
                nums[pivot]=temp;
                break;
            }
        }

        reverse(nums,pivot+1,nums.length-1);
    }
    protected void reverse(int[] nums,int start,int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }
}
