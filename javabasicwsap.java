import java.util.Scanner;
public class javabasicwsap {
    public static void main (String []args){
        int a,b;
       int temp ;
       Scanner sc=new Scanner(System.in);
       System.out.printf("Enter the Value of A");
       a=sc.nextInt();
       System.out.println("Enter the value of B");
       b=sc.nextInt();
       System.out.println("Before the swap values"+a+"A & B"+b);
        temp=b;
       b=a;
      
       a=temp;
       System.out.println("Before the swap values"+a+"A & B"+b);
    }
}
