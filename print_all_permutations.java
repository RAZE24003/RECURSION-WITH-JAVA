public class print_all_permutations {
    public static void permutations(String s,String newa ) {
        if(s.length()==0)
        {
            System.out.println(newa);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            String abc=s.substring(0, i)+s.substring(i+1);
            permutations(abc, newa+curr);

        }
        
    }
    public static void main(String[] args) {
        String str="abc";
        permutations(str, " ");
    }
}
