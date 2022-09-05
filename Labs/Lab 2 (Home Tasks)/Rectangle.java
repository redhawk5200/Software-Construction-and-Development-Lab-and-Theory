public class Rectangle extends Shape{
	public int length;
	public int width;
 
	Rectangle(int length, int width){
        this.length=length;
    	this.width=width;
	}
 
	public void generateArea(){
        System.out.println("The area of rectnagle is: "+ length*width);
	}
 
}
