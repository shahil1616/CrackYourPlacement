class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> l= new ArrayList<>();
        int min[]= new int[matrix.length];
        int max[]= new int [matrix[0].length];

        for(int i=0;i<matrix.length;i++)
        {
            int min1=10000000;
            for(int j=0;j<matrix[0].length;j++)
            {
                min1=Math.min(min1,matrix[i][j]);
            }
            min[i]=min1;
        }

           for(int i=0;i<matrix[0].length;i++)
        {
            int max1=0;
            for(int j=0;j<matrix.length;j++)
            {
                max1=Math.max(max1,matrix[j][i]);
            }
            max[i]=max1;
        }

         for(int i=0;i<matrix.length;i++)
        {
           
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==min[i] && matrix[i][j]==max[j])
                {
                    l.add(matrix[i][j]);

                }
            }
        }
        return l;
        
    }
}