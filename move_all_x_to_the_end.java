public class move_all_x_to_the_end {
    //complexity o(n)
    public static void name(String str,int i,int count,String newstr) {
        if(i==str.length())
        {
             for(i=0;i<count;i++)
        {
            newstr+='x';
        }
            System.out.println(newstr);
            return;
        }
        char ch=str.charAt(i);
        if(ch== 'x'){
            count++;
            name(str, i+1, count, newstr);
        }
        else{
            newstr+=ch;
            name(str, i+1, count, newstr);
        }
        
    }
    public static void main(String[] args) {
    String s="axbcxxd";
    name(s, 0, 0, " ");         
    }
    
}
 