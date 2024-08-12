class Solution {
    public int minDays(int[][] grid) {
        int noi=numIslands(grid);
        if(noi ==0 || noi>1)
        return 0;
       for(int i=0;i<grid.length;i++)
       {
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[i][j]==1)
            {
                grid[i][j]=0;
              int n=  numIslands(grid);
              if(n>=2|| n==0)
              {
                return 1;
              }
              grid[i][j]=1;
            }
        }
       }
       return 2;
        
    }

     public int numIslands(int [][] grid) {


    
    int max=0;
       boolean back[][]=new boolean [grid.length][grid[0].length]; 
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]==1 &&back[i][j]==false){
                  maxArea(i,j,grid,back);
                 max++;
               }
               }
           }
        return max;
    }

    public void maxArea(int i ,int j, int [][] grid, boolean [][]back){
        if(i<0 || j<0 ||i>= grid.length || j>=grid[0].length|| grid[i][j]==0|| back[i][j]==true) return;
      
      back[i][j]=true;
        maxArea(i+1,j,grid,back);
        maxArea(i,j+1,grid,back);
        maxArea(i-1,j,grid,back);
        maxArea(i,j-1,grid,back);
       

      

        

    }
}