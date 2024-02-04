public class remove_all_duplicate {
    //complexity o(n)

    public static boolean[] map=new boolean[26];

    public static void duplicate(String str,int i,String s) {
        if(i==str.length())
        {
            System.out.println(s);
            return;
        }
    char curr=str.charAt(i);
     if(map[curr-'a']) 
     {
        duplicate(str, i+1,s);
     }
     else{
        s+=curr;
        map[curr-'a']=true;
        duplicate(str, i+1, s);
     }
        
    }
    public static void main(String[] args) {
        String s="abbccda";
        duplicate(s, 0, " ");
    }
    
}
