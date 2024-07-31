class Solution {
    int dp[][];
    public int minHeightShelves(int[][] books, int shelfWidth) {
           int n = books.length;
         dp= new int[n][shelfWidth + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return slove(books,0,shelfWidth,shelfWidth,0);

        
    }
    public int slove(int arr[][],int i,int w,int remw,int cw)
    {
        if(i==arr.length)
        return cw;
        if(dp[i][remw]!=-1)
        return dp[i][remw];
        int op1=cw+slove(arr,i+1,w,w-arr[i][0],arr[i][1]);
        int op2=Integer.MAX_VALUE;
        if(remw>=arr[i][0])
        {
            op2=slove(arr,i+1,w,remw-arr[i][0],Math.max(cw,arr[i][1]));
        }
        return dp[i][remw]= Math.min(op1,op2);
    }
}