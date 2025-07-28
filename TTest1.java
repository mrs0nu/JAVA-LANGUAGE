abstract class Demo {
	abstract void show();
	Demo(){
		System.out.println("Abstract Demo Constructor");
	}
	void display(){
		System.out.println("Abstract Demo Class ");
	}
}
public class TTest extends Demo{
	public void show(){
		System.out.println("You all Being watch");
	}
	public static void main (String []args){
		TTest test =new TTest();
		test.show();
		test.display;
	}
}