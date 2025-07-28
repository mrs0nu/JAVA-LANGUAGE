public class divide{
    public static void printin(int n){
        if(n==0)
        return;
        printin(n-1);
        System.out.println(n);

    }
    public static void printde(int n){
        if(n==-4){
            return;
        }
        System.out.println(n);
        printde(n-1);
      


    }
    public static void main(String agrs[]){
        int a=8,b=11;
         printde(a);
         printin(b);

    }
    
}
