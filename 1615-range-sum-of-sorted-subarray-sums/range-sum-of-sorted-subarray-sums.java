class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int len=(n*(n+1))/2;
        int sum[]= new int[n];
        sum[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            sum[i]=nums[i]+sum[i-1];

        }
        int arr[]= new int[len];
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i==j)
                {
                    arr[k++]=nums[i];
                }
                else
                {
                    if(i==0)
                    {
                        arr[k++]=sum[j];
                    }
                    else{
                        arr[k++]=sum[j]-sum[i-1];
                    }
                }
            

            }
        }
        Arrays.sort(arr);
        int ans=0;
        for(int i=left-1;i<right;i++)
        {
            ans=(ans+arr[i])%1000000007;
        }
        return ans;
        
    }
}