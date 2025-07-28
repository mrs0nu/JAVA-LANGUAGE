import java.util.*;
public class stringinput{
	public static void main (String []args){
	Scanner inputt=new Scanner(System.in);
System.out.println("Type the Paragraph for input");

String Para="I am concatinate",Paragraph=inputt.nextLine();	
System.out.println(Paragraph);
System.out.println(Paragraph.length()); 
Paragraph=Paragraph+Para;
System.out.println(Paragraph);
System.out.println(Paragraph.length()); 
	}
}
