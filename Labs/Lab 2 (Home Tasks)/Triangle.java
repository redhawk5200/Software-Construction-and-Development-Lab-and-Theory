public class Triangle extends Shape{
	public double height;
	public double base;
 
	Triangle(double height, double base){
        this.height=height;
        this.base=base;
	}
 
	public void generateArea(){
        System.out.println("The area of triangle is: "+ 0.5*height*base);
	}
}
