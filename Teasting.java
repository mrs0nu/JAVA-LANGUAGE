interface Shape{
 void calculateAera();
 void calculateAeraAgain();
final static float ansIs;
}
 class Circle implements Shape{
final static float PI=3.14f;
 float r;
 void calculateAeraAgain( float redius){
	 this.r=redius*redius;
	 ansIs=r*PI;
	 System.out.println("Aera of Circle="+ansIs);
 }
}
class Rectangle implements Shape{
	 final static float l,b;
	void calculateAera(float L,float B){
		this.l=L;
		this.b=B;
		
		this.ansIs=l*b;
		System.out.println("Aera of Rectangle="+ansIs);
	}
}
public class Teasting{
	public static void main(String []args){
	Circle circle =new Circle();
	Rectangle rectangle=new Rectangle();
	circle.calculateAeraAgain(6.00f);
	rectangle.calculateAera(5.00f,7.00f);
		}
	}