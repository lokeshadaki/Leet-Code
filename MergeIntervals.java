class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> answer=new ArrayList<>();
        answer.add(intervals[0]);
        for(int i=1;i<intervals.length;i++)
        {
            int[] last=answer.get(answer.size()-1);
            if(intervals[i][0]<=last[1])
            {
                last[1]=Math.max(last[1],intervals[i][1]);
            }
            else
            {
                answer.add(intervals[i]);
            }
        }
        return answer.toArray(new int[answer.size()] []);
    }
}
