public class tower_of_hanoi {
    //complexity o(2^n)
    
    public static void print(int n,String string,String string2,String string3) {
        if(n==1)
        {
            System.out.println("transfer"+ n +"from"+string+"to"+string3);
            return;
        }
        
        print(n-1, string, string3, string2);
        System.out.println("transfer"+ n +"from"+string+"to"+string3);
        print(n-1, string2, string, string3);
    }
    public static void main(String[] args) {
        int n=3;
        print(n, " s ", " h ", " d ");
    }
}
