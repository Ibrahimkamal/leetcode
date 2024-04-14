class Solution {
    int count=0;
    private void dfs(int node,int parent,Map<Integer,List<int[]>> adj){
        if(!adj.containsKey(node)){
            return;
        }for(int[] nei:adj.get(node)){
            int neighbour=nei[0];
            int sign=nei[1];
            if(neighbour!=parent){
                count+=sign;
                dfs(neighbour,node,adj);
            }
        }
    }
    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] connection : connections) {
            adj.computeIfAbsent(connection[0], k -> new ArrayList<int[]>()).add(
                    new int[]{connection[1], 1});
            adj.computeIfAbsent(connection[1], k -> new ArrayList<int[]>()).add(
                    new int[]{connection[0], 0});
        }
        dfs(0,-1,adj);
        return count;
    }
}