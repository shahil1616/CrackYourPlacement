class Solution {
   
    public int findCircleNum(int[][] isConnected) {
       int v[] = new int[isConnected.length];
    //    Arrays.fill(v,0);
        int c=0;
       for(int i=0;i<isConnected.length;i++)
       {



        // System.out.println(v[i]);


        if(v[i]==0)
        {
           
            c++;
            dfs(i,isConnected,v);

        }
       }
       return c;


        
    }
    public void  dfs(int u,int arr[][],int v[])
    {
        
        v[u]=1;
        System.out.println(v[u]+" "+u);
         
        for(int i=0;i<arr.length;i++)
        {
            if(i!=u && arr[u][i]==1 && v[i]!=1 )
            {
                dfs(i,arr,v);
            }
        }
    }
}