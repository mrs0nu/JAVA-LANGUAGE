import java.io.*;
public class Reader{
	public static void  main(String []args){
		String filename ="Radhe.txt";
		
		try(FileReader reader=new FileReader(filename) ){
			int read =0;
			do{
				read=reader.read();
			System.out.print((char)read);
			}while(read!= -1);
		}
	catch(IOException e ){
		System.out.printf("Exception occured %s",e.getMessage());
	}
	}
}