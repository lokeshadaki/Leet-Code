class FindFirst_LastPositionElementSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] answer=new int[2];
        answer[0]=firstPosition(nums,target);
        answer[1]=lastPosition(nums,target);
        return answer;
    }
    public int firstPosition(int[] nums,int target)
    {
        int low=0 , high=nums.length-1 , answer=-1 , mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
            {   
                answer=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return answer;
    }

    public int lastPosition(int[] nums,int target)
    {
        int low=0 , high=nums.length-1 , answer=-1 ,mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
            {
                answer=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return answer;
    }

}
