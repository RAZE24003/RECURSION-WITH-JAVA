public class factorial_of_n {
    public static int printnum(int n) {
        
        if(n==1 || n==0)
        {
         return 1 ;
        }
        int fact=printnum(n-1);
        int fact1=n*fact;
        return fact1;
   
    }
   
    public static void main(String[] args) {
        int n=5;
        int ans=printnum(n);
        System.out.println(ans);     
    }
}
