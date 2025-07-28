class Demo{
	Ttest test;
	
	Demo (Ttest test){
		this.test=test;
	}
	 void display(){
		System.out.println("Test class is:"+test.data);
	}
}
	public class Ttest{
		int data =10;
		Ttest(){
			Demo demo =new Demo(this);
			demo.display();
		}
	public static void main(String []args){
		Ttest test =new Ttest();
	}
	}