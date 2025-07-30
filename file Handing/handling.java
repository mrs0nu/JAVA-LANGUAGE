import java.util.*;
public class Handling{
	
	public static void main(String []args){
		String filename="hell.txt";
		try{
			FileWriter writer =new FileWriter(filename);
			writer.write("I am writing");
			writer.flush();
			System.out.println("file writen successfully");
			
		}
		catch(IOException ex){
				System.out.printf("Exception occured %s\n");
				ex.getMessage();
			}
	}
}