import java.util.*;
public class Exception1{
	
	public static void main(String []args){
	int a=5,b=0;
	int arr[]={2,34,3,4,5,};
	try{
		System.out.println(arr[6]);
	System.out.print(b/0);
	}
	catch(ArrayIndexOutOfBoundsException ex){
		System.out.print("Exception here"+ex.getMessage());
		ex.printStackTrace();
	}catch(ArithmeticException ex){
		System.out.print("err arr");
		
	}
	System.out.println("I am continuee");
	}
}
