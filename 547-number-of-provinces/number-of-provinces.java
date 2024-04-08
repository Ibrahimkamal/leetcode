class UnionFind{
    int [] parent;
    int [] size;
    public UnionFind(int n){
        parent=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public int find(int i){
        if(parent[i]!=i){
            parent[i]=find(parent[i]);
        }
        return parent[i];
    }
    public boolean union(int x,int y){
        int rootX=parent[x];
        int rootY=parent[y];
        if(rootX==rootY){
            return false;
        }
        if(rootX!=rootY){
            if(size[rootX]>size[rootY]){
                parent[rootY]=rootX;
                size[rootX]+=size[rootY];
            }else{
                parent[rootX]=rootY;
                size[rootY]+=size[rootX];
            }
        }
        return true;
    }
}

class Solution {
    public int findCircleNum(int[][] isConnected) {
        UnionFind uf=new UnionFind(isConnected.length);
        int components=isConnected.length;
        for(int i=0;i<isConnected.length;i++){
            for(int j=i+1;j<isConnected.length;j++){
                if(isConnected[i][j]==1 && uf.find(i)!=uf.find(j)){
                    components--;
                    uf.union(i, j);
                }
            }
        }
        return components;
    }
}