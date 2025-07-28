import java.util.*;
public class Palindrome{
	public static boolean isPalindrome(String Pali){
		for(int i=0;i<Pali.length()/2;i++){
			int n=Pali.length();
		if(Pali.charAt(i)!=Pali.charAt(n-1-i)){
			return false;
		}
	}
		return true;
	}
	public static void main(String []args){
		
		String Pali="racecar";
		
	System.out.println(isPalindrome(Pali));
	}
}