class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        
        for(int i=0;i<details.length;i++)
        {
             String a=details[i];
            String str= a.substring(11,13);
            int c= Integer.parseInt(str);
            if(c>60)
                count++;
            
        }
        return count;
        
    }
}