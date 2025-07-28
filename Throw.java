import java.util.*;
public class Throw {
    public static void printname(String name)
    throws IllegalArgumentException{
    {
        
            if (name.contains("-")) {
                throw new IllegalArgumentException("Name Contains");
            }
            System.out.println(name);
        }
    }
    public static void main (String []args){
        Scanner input=new  Scanner(System.in);
    String Str= new String();
     
System.out.println("Enter the your name");
   Str=input.nextLine();
   printname(Str);
}
}
     