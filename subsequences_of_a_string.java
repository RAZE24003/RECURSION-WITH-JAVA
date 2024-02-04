public class subsequences_of_a_string {
    //complexity o(2^n)
    public static void sub(String str,int i,String s) {
    
        if(i==str.length())
        {
            System.out.println(s);
            return;
        }
        char ch=str.charAt(i);
        //to be
        sub(str, i+1, s+ch);

        //not to be
        sub(str, i+1, s);
    }
    public static void main(String[] args) {
        String str="abc";
        sub(str, 0, " ");
    }
}
