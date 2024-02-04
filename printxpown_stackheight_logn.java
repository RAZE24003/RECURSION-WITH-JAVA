public class printxpown_stackheight_logn {
     public static int   name1(int x,int n) {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        //if n is even 
        if (n%2==0)
        {
           return name1(x, n/2)* name1(x, n/2);
        }
        else{

            return name1(x, n/2)*name1(x, n/2)*x;
        }

    }
    public static void main(String[] args) {
        int x=2;int n=5;
        int ans=name1(x, n);
        System.out.println(ans);
    }
    
}
