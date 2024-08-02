class Solution {
    public int minSwaps(int[] nums) {
        
        return Math.min(slove(nums,0),slove(nums,1));
    }
    public int slove(int arr[],int val)
    {
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==val)
            cnt++;
        }
        if(cnt==0|| cnt==n)
        return 0;
        int i=0;
        int j=0;
        int max=0;
        int cur=0;
        while(j<cnt)
        {
            if(arr[j++]==val)
            cur++;
        }
        max= Math.max(cur,max);
        while(j<n)
        {
            if(arr[i++]==val) cur--;
            if(arr[j++]==val) cur++;
            max=Math.max(cur,max);
        }
        return cnt-max;
    }
}