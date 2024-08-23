class Solution {
    public String fractionAddition(String s) {

        

        int deno=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)=='/')
            {
                int a=(s.charAt(i)-'0');
                if(a==1)
                {
                    if(i+1<s.length() && s.charAt(i+1)=='0')
                     a=10;
                }
                
                deno=deno*a;
            }
        }
        int num=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i+1)=='/')
            {
                int d=s.charAt(i+2)-'0';
                if(d==1)
                {
                    if(i+3<s.length() && s.charAt(i+3)=='0')
                     d=10;
                }
                int a=(s.charAt(i)-'0');
                if(a==0)
                {
                    if(i-2>= 0 &&s.charAt(i-2)=='-')
                      a=-10;
                      else
                      {a=10;}
                }
                if(i-1>=0 && s.charAt(i-1)=='-')
                {
                    a=a*-1;
               
                }
               
                num=num+a*(deno/d);

                System.out.println(a+"--"+d+"--"+num);
                

                
            }

            
           

        }
        // System.out.println(deno);
        if(num==0)
        return "0/1";
        int gcd=gcd(Math.abs(num),Math.abs(deno));
        // System.out.println(num);

        num=num/gcd;
        deno=deno/gcd;

        return num+"/"+deno;
            
         
    }
    public int gcd(int a,int b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);
    }

}