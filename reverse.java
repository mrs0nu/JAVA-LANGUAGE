
public class reverse{
    
    public static void main (String []agrs){
        int i,a=23,n=6,rem,reverse=0;

        for(i=1;i<=n;i++){
            rem=a%10;
            a=a/10;
           reverse=reverse*10+rem;
        }
        System.out.print(reverse);
    }
}
