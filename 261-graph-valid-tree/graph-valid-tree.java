class UnionFind{
    private int[]parent;
    private int[]size;
    public UnionFind(int n){
        parent=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public int find(int a){
        int root=a;
        while(parent[root]!=root){
            root=parent[root];
        }
        while(a!=root){
            int oldRoot=parent[a];
            parent[a]=root;
            a=oldRoot;
        }
        return root;
    }
    public boolean union(int a,int b){
        int rootA=find(a);
        int rootB=find(b);
        if(rootA==rootB)
        {
            return false;
        }
        if (size[rootA]<size[rootB]){
            parent[rootA]=parent[rootB];
            size[rootB]+=size[rootA];
        }else{
            parent[rootB]=parent[rootA];
            size[rootA]+=size[rootB];
        }
        return true;
    }
}


class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1){
            return false;
        }
        UnionFind uf=new UnionFind(n);
        for(int[] edge:edges){
            if (!uf.union(edge[0], edge[1])) {
                return false;
            }
        }
        return true;
    }
}