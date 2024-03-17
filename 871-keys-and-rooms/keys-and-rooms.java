class Solution {
    int[] visited;
    List<List<Integer>> rooms;
    public void dfs(List<Integer> keys){
        for(int key:keys){
            if(visited[key]==1){
                continue;
            }else{
                visited[key]=1;
                dfs(rooms.get(key));
                
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
      this.visited=new int[rooms.size()];
      this.visited[0]=1;
      this.rooms=rooms;
      dfs(rooms.get(0));
      for(int i:visited){
        if (i==0){
            return false;
        }
      }
      return true;

    }
}