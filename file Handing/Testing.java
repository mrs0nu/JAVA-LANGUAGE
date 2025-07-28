import java.util.*;  
public class Testing{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome To Exception Handing");
		System.out.println("Enter the Two no.");
		int first=input.nextInt();
		int second=input.nextInt();
		try{
		int result=first/second;
		System.out.printf("result is %d",result);
		}
catch(ArithmeticException exception){
	 
	System.out.printf("%s Divide by zero",exception.getMessage());
}		
 }
}