public class chckifthearrayissorted {
    //complexity o(n)
    public static void print(int arr[],int n) {
        if(n==arr.length-1)
        {
            System.out.println(" sorted arr");
            return;
        }
        if(arr[n]<arr[n+1])
        {
            print(arr, n+1);
        }
        else
        {
            System.out.println("unsorted array");
        }


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        print(arr, 0);
    }
    
}
