import java.lang.Math;
public class Circle extends Shape{
	public double radius;
 
	Circle(double radius){
        this.radius=radius;
	}
 
	public void generateArea(){
        System.out.println("The area of circle is:" + Math.PI*radius*radius);
	}
}
