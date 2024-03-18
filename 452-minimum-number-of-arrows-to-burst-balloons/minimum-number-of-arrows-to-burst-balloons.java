
import java.util.Collection;class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (o1, o2) -> {
            // We can't simply use the o1[1] - o2[1] trick, as this will cause an 
            // integer overflow for very large or small values.
            if (o1[1] < o2[1]) return -1;
            return 1;
        });
        for(int[] pair:points){
            System.out.println(pair[0]+" "+pair[1]);
        }
        int result=points.length;
        for(int i=0;i<points.length-1;i++){
            int end=points[i][1];
            while(i<points.length-1 && end>=points[i+1][0]){
                result--;
                i++;
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
