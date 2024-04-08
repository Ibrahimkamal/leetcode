class Solution {
    private boolean [] visited;
    public void dfs(List<List<Integer>> rooms,int i){
        if(visited[i])
            return;
        visited[i]=true;
        for(int room:rooms.get(i)){
            dfs(rooms,room);
        }

    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // if(rooms.size()==0)
        //     return false;
        visited=new boolean[rooms.size()];
        dfs(rooms,0);
        for(boolean x:visited){
            if(!x)
                return false;
        }
        return true;
    }
}