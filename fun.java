public class fun{
   public static int fib(int terms){
   if(terms==0||terms==1){
   return (1);
   }
   else{
   return 
   
    (fib(terms-1)+ fib(terms-2))}

        }

    }

//    }
//     // public static int sumofnum(int n,int o){
//     //    int  sum=n+o;
     
//     //  return sum;
//      }
    public static void main (String []agrs){
    //    int c,q=99,r=10;
    //     System.out.println(c=sumofnum(q,r));
        int terms=8,i;
   
        for(i=0;i<=terms;i++){
            System.out.print(fib(terms));
            System.out.println();
    
    }
    
}
