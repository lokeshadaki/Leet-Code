class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0,width = 0;
        int right = height.length - 1;
        int maxArea = 0 , area = 0 ;

        while ( left < right)
        {
            width = right - left ;

            int hei = Math.min (height[left] , height[right]);

            area = width * hei ;

            maxArea = Math.max (maxArea , area);

            if(height[left] < height[right])
            {
                left ++;
            }
            else
            {
                right --;
            }
        }

        return maxArea;
    }
}
