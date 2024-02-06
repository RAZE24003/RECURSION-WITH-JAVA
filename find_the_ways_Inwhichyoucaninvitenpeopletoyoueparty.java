import java.util.ArrayList;
//complexity o(2^n)

public class find_the_ways_Inwhichyoucaninvitenpeopletoyoueparty {

     public static void way(ArrayList<Integer>subset)
     {
        for(int i=0;i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
     }
    
    public static void ways(int n,ArrayList<Integer>subset) {
        if(n==0)
        {
            way( subset);
            return;
        }
        //add
        subset.add(n);
        ways(n-1, subset);
        //notadd
        subset.remove(subset.size()-1);
        ways(n-1, subset);
    }
    public static void main(String[] args) {
        int n=4;
        ArrayList<Integer>subset=new ArrayList<>();
        ways(n, subset);
    }
}
