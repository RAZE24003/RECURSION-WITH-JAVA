public class sum_of_n_natural_number {
     public static void printnum(int i,int n,int sum) {
        
        if(i==n)
        {
            sum+=i;
            System.out.println("The sum of first n mumbers are" + sum);
            return;
        }
        sum+=i;
        printnum(i+1, n, sum);
        System.out.println(i);
        
    }
   
    public static void main(String[] args) {
        int n;
        printnum(1, 5, 0);
    }
    
}
