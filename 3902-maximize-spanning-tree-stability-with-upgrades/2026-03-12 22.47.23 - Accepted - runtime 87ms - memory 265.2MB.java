class DSU{
    int[] parent;
    DSU(int[] parent){
        this.parent=parent.clone();
    }
    int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    void join(int x,int y){
        int px=find(x);
        int py=find(y);
        parent[px]=py;
    }
}
class Solution {
    private static final int max_stability=200000;
    public int maxStability(int n, int[][] edges, int k) {
        int ans = -1;
        if(edges.length<n-1){
            return -1;
        }
        List<int[]> mustedges = new ArrayList<>();
        List<int[]> optionaledges = new ArrayList<>();
        for(int[] edge:edges){
            if(edge[3]==1){
                mustedges.add(edge);
            }
            else{
                optionaledges.add(edge);
            }
        }
        if(mustedges.size()>n-1){
            return -1;
        }
        optionaledges.sort((a,b)->b[2]-a[2]);
        int selectedinit=0;
        int mustminstability=max_stability;
        int[] init = new int[n];
        for(int i=0;i<n;i++){
            init[i]=i;
        }
        DSU dsuinit = new DSU(init);
        for(int[] e:mustedges){
            int u=e[0];
            int v=e[1];
            int s=e[2];
            if(dsuinit.find(u)==dsuinit.find(v)||selectedinit==n-1){
                return -1;
            }
            dsuinit.join(u,v);
            selectedinit++;
            mustminstability=Math.min(mustminstability,s);
        }
        int l=0;
        int r= mustminstability;
        while(l<r){
            int mid=l+(r-l+1)/2;
            DSU dsu = new DSU(dsuinit.parent);
            int selected=selectedinit;
            int doubledcount=0;
            for(int[] e:optionaledges){
                int u=e[0];
                int v=e[1];
                int s=e[2];
                if(dsu.find(u)==dsu.find(v)){
                    continue;
                }
                if(s>=mid){
                    dsu.join(u,v);
                    selected++;
                }
                else if(doubledcount<k && s*2 >= mid){
                    doubledcount++;
                    dsu.join(u,v);
                    selected++;
                }else{
                    break;
                }
                if(selected==n-1){
                    break;
                }
            }
            if(selected!=n-1){
                r=mid-1;
            }else{
                ans=l=mid;
            }
        }
        return ans;
    }
}