class Solution {
    public int equalPairs(int[][] grid) {
        
        HashMap<ArrayList<Integer>,Integer> map=new HashMap<>();
        int results=0;
        //handle rows
        for(int i=0;i<grid.length;i++)
        {
            ArrayList <Integer> temp=new ArrayList<>();
            for(int j=0;j<grid.length;j++)
            {
                temp.add(grid[i][j]);
            }
            map.put(temp,map.getOrDefault(temp, 0)+1);
        }
        //handle cols
        for(int i=0;i<grid.length;i++)
        {
            ArrayList <Integer> temp=new ArrayList<>();
            for(int j=0;j<grid.length;j++)
            {
                temp.add(grid[j][i]);
            }
            if (map.containsKey(temp))
            {
                results+=map.get(temp);
            }
        }
        return results;
    }
}