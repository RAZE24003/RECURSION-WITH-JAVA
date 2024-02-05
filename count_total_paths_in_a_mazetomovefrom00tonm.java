public class count_total_paths_in_a_mazetomovefrom00tonm {
    public static int coutpath(int i,int j,int n,int m){
        
        if(i==n || j==m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }

        //movedownwards

        int down=coutpath(i+1, j, n,m);
       
        //moveright

        int right=coutpath(i, j+1, n, m);
        return  down+right;
    }
    public static void main(String[] args) {
        int n=3,m=3;
       int total= coutpath(0 , 0, n, m);
       System.out.println(total);
    }
}
