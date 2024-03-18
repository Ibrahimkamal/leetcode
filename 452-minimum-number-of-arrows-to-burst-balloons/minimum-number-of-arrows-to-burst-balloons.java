
import java.util.Collection;class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        // sort by x_end
        Arrays.sort(points, (o1, o2) -> {
            // We can't simply use the o1[1] - o2[1] trick, as this will cause an 
            // integer overflow for very large or small values.
            if (o1[1] == o2[1]) return 0;
            if (o1[1] < o2[1]) return -1;
            return 1;
        });
        for(int[] pair:points){
            System.out.println(pair[0]+" "+pair[1]);
        }
        int result=1;
        int xStart, xEnd, firstEnd = points[0][1];
        for(int[]p:points){
            xStart=p[0];
            xEnd=p[1];
            if(firstEnd<xStart){
                result++;
                firstEnd=xEnd;
            }
        }
        return result;
    }
}
// 
// 
// 
// 
// 
// - - - - - - - - - -- -- -- -- -- -- -- -- -- -- -- 
// - - - - - - - - - -- -- -- -- -- -- -- -- -- -- -- 
// - - - - - - - - - -- -- -- -- -- -- -- -- -- -- -- 
// - - - - - - 00000000000000 -- -- -- -- -- -- -- -- 
// 00000000000 - - - -- -- -- -- -- -- -- -- -- -- -- 
// - 0000000000000 - -- -- -- -- -- -- -- -- -- -- -- 
// - - - - - - - - - 00000000000000000000 -- -- -- -- 
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 
