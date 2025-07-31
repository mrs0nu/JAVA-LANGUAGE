import java.io.*;
public class Handling{
	
	public static void main(String []args){
		String filename="Radhe.txt";
		try(FileWriter writer =new FileWriter (filename)){
			for (int i=0;i<100;i++){
				writer.write("Radhe");
				
			}
			
			writer.flush();
			System.out.println("Chanting Successfully");
			
		}
		catch(IOException ex){
				System.out.printf("Exception occured %s\n");
				ex.getMessage();
			}
	}
}