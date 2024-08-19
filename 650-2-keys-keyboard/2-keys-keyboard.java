class Solution {
    public int minSteps(int n) {
        if(n==1)
        return 0;
       return 1+slove(n,1,1); 
    }
    public int slove(int n,int c,int i)
    {
        if(c==n)
        return 0;
        if(c>n)
        return 1000;

        int a= 2+slove(n,c*2,c);
        int b=1+slove(n,c+i,i);
        return Math.min(a,b);
    }
}