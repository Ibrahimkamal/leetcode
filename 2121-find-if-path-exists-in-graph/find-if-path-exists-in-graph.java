class UnionFind{
    int[]parents;
    int[]size;
    UnionFind(int n){
        parents=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parents[i]=i;
            size[i]=1;
        }
    }
    int find(int x){
        if(x!=parents[x]){
            parents[x]=find(parents[x]);
        }
        return parents[x];
    }
    boolean connect(int x,int y){
        int rootX=find(x);
        int rootY=find(y);
        if(rootX!=rootY){
            if(size[rootX]>size[rootX]){
                parents[rootY]=rootX;
                size[rootX]+=size[rootY];
            }else{
                parents[rootX]=rootY;
                size[rootY]+=size[rootX];
            }
            return true;
        }
        return false;
    }
}

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UnionFind uf=new UnionFind(n);
        for(int i=0;i<edges.length;i++){
            int s=edges[i][0];
            int d=edges[i][1];
            uf.connect(s,d);
        }
        if(uf.find(source)==uf.find(destination)){
            return true;
        }
        return false;
    }
}