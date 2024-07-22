class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int arr[][]= new int[names.length][2];
        for(int i=0;i<names.length;i++)
        {
            arr[i][0]=i;
            arr[i][1]=heights[i];

        }
        Arrays.sort(arr,(a,b) ->(b[1]-a[1]));
        // for(int i=0;i<names.length;i++)
        // {
        //     System.out.print(arr[i][0]+" ");
        // }


        String ans[]= new String[names.length];
        for(int i=0;i<names.length;i++)
        {
            ans[i]=names[arr[i][0]];
        }
        return ans;
        
    }
}