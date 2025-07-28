import java.util.Scanner;


public class basic {
public static float sumoftwono(int a,float b){
    float  sum=a+b;
    return sum;
}
    public static void main (String []args){
Scanner scanner=new Scanner(System.in);
float y;
int x;
System.out.println("Enter The Two Num For Their Sum");
System.out.println("Enter The First Number");
x=scanner.nextInt();
System.out.println("Enter The Second Number");
y=scanner.nextFloat();
float Answer=sumoftwono(x,y);

System.out.println("Sum of the Numers"+Answer);
    }
}
