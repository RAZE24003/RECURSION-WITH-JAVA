public class keypad {

    //complexity o(4^n)
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void print(String str,int i,String c) {
        if(i==str.length())
        {
            System.out.println(c);
            return;
        }
        char curr=str.charAt(i);
        String map=keypad[curr-'0'];

        for(int j=0;j<map.length();j++)
        {
            print(str, i+1, c+map.charAt(j));
        }
        
    }
    public static void main(String[] args) {
        String s="2";
        print(s, 0, " ");
    }
}
