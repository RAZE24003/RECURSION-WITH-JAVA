public class recursion2 {
     public static void printnum(int n) {

        if(n>5)
        {
            return;
        }
        System.out.println(n);
        printnum(n+1);
        
    }
   
    public static void main(String[] args) {
        int n=1;
        printnum(n);
    }
    
}
