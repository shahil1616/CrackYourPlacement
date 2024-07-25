class Solution {
    public int[] sortArray(int[] nums) {
        return mergesort(nums,0,nums.length-1);
        
    }
    public int [] merge(int []a,int[]b)
    {
        int i=0;
        int j=0;
        int k=0;
        int ans[]= new int[a.length+b.length];
        while(i<a.length&&j<b.length)
        {
            if(a[i]<b[j])
            {
                ans[k]=a[i];
                i=i+1;
                
            }
            else
            {
                ans[k]=b[j];
                j=j+1;
            }
            k=k+1;
        }
        while(i<a.length)
        {
            ans[k]=a[i];
            i=i+1;
            k=k+1;
        }
        while(j<b.length)
        {
            ans[k]=b[j];
            j=j+1;
            k=k+1;
        }
        return ans;
    }
    public int[] mergesort(int[] arr,int l,int h)
    {
        if(l==h)
        {
            int br[]=new int[1];
            br[0]=arr[l];
            return br;
        }
        
        int mid=(l+h)/2;
        int larr[]=mergesort(arr,l,mid);
        int rarr[]=mergesort(arr,mid+1,h);
        int ans[]=merge(larr,rarr);
        return ans;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}