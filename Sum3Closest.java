class Sum3Closest {
    public int threeSumClosest(int[] nums, int target) {
        int closest,left,right,i,sum;
        Arrays.sort(nums);
        closest=nums[0] + nums[1] + nums[2];

        for(i=0 ; i<nums.length ; i++)
        {
            left=i+1;
            right=nums.length-1;

            while(left < right)
            {
                sum=nums[i] + nums[left] + nums[right];

                if( Math.abs(sum-target) < Math.abs(closest-target))
                {
                    closest=sum;
                }
                
                if(sum < target)
                {
                    left++;
                }
                else if(sum > target)
                {
                    right--;
                }
                else{
                    return target;
                }
            }
        }
        return closest;
    }
}
