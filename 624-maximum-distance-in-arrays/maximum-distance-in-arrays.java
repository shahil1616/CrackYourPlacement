class Solution {
    public int maxDistance(List<List<Integer>> a) {
        int ans=Integer.MIN_VALUE;

        int min=a.get(0).get(0);
        int max=a.get(0).get((a.get(0).size()-1));

        for(int i=1;i<a.size();i++)
        {
            List<Integer> l=a.get(i);
            ans=Math.max(Math.abs(min-l.get(l.size()-1)),ans);
            ans=Math.max(Math.abs(max-l.get(0)),ans);
            min=Math.min(min,l.get(0));
            max=Math.max(max,l.get(l.size()-1));

        }
        return ans;

      
        
    }
}