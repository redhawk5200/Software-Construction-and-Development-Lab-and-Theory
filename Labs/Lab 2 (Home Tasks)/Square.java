public class Square extends Rectangle{
	Square(int side){
        super(side,side);
	}
 
	public boolean checkSides(){
        if(length==width){
        	return true;
    	}
    	else{
        	return false;
    	}
	}
 
	public void generateArea(){
        if(checkSides()){
            System.out.println("The area of square is: "+ length*width);
    	}
	}
}
