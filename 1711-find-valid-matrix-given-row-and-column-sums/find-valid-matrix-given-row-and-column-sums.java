class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length;
        int m=colSum.length;
        int arr[][]= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(rowSum[i]<colSum[j])
                {
                    arr[i][j]=rowSum[i];
                   
                    colSum[j]=colSum[j]-rowSum[i];
                     rowSum[i]=0;
                    if(colSum[j]<0)
                    colSum[j]=0;
                }
                else
                {
                    arr[i][j]=colSum[j];
                 
                    rowSum[i]=rowSum[i]-colSum[j];
                       colSum[j]=0;
                    if(rowSum[i]<0)
                    rowSum[i]=0;


                }

            }
        }
        return arr;
    }
}