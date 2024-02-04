public class find_the_1standlast{
    public static int f=-1;
    public static int l=-1;
    
    public static void occur(String str,int i,int element) {
        if(i==str.length())
        {
            System.out.println(f);
            System.out.println(l);
            return;
        }
        char curr=str.charAt(i);
        if(curr==element)
        {
            if(f==-1)
            {
                f=i;
            }
            else{
                l=i;
            }
        }
        occur(str, i+1, element);
    }
    public static void main(String[] args) {
        String s="abaacdaefaah";
        occur(s, 0, 'a');
        
    }
}
