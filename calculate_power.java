public class calculate_power {

    public static int   name1(int x,int n) {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int xpow=name1(x, n-1);
        int xpower=x*xpow;
        return xpower;
        
    }
    public static void main(String[] args) {
        int x=2;int n=5;
        int ans=name1(x, n);
        System.out.println(ans);
    }
}
