class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list=new ArrayList<>();
        boolean added=false;
        if (intervals.length==0)
            return new int[][]{{newInterval[0],newInterval[1]}};
        for(int[] interval:intervals){
            if(interval[0]<newInterval[0] && !added){
                list.add(interval);
            }else{
                list.add(newInterval);                
                list.add(interval);

                added=true;
            }
        }
        if(!added){
            list.add(newInterval);
        }
        ArrayList<int[]> result=new ArrayList<>();
        result.add(list.get(0));
        for(int i=1;i<list.size();i++){
            int[] current=list.get(i);
            int[] prev=result.getLast();
            if(current[0]<=prev[1])
            {
                result.removeLast();
                result.add(new int[]{prev[0],Math.max(current[1],prev[1])});
            }else{
                result.add(current);
            }
        }
        int[][] r=new int[result.size()][2];
        result.toArray(r);
        return r;
    }
}