public class str_rev { 
    //complexity o(n)
    public static void print(String n,int a ) {
        if(a==0)
{
    System.out.print(n.charAt(a));
    return;
}
    System.out.print(n.charAt(a));
     print(n, a-1);   
    }
    public static void main(String[] args) {
      String x="abcd";
      print(x, x.length()-1);
    }
    
}
