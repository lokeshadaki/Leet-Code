class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String args[]){
        TwoSum s=new TwoSum();
        int num[]={2,7,11,15};
        int tar=5;
        int sums[]=s.twoSum(num,tar);
    }
}
