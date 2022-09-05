abstract class Bill{
   	protected double dis;
   	protected double bill, final_bill;
   	
   	abstract double getBill();
   	
}
 
class ImtiazStore extends Bill{
   	
   	ImtiazStore(double bill){
         	this.bill = bill;
         	dis = 0.07;
   	}
   	
   	public double getBill () {
         	
         	final_bill = bill - (bill * dis);
         	
         	return final_bill;
         	
   	}
   	
}
 
class BinHashimStore extends Bill{
   	
   	BinHashimStore(double bill){
         	this.bill = bill;
         	
         	dis = 0.05;
   	}
   	
   	public double getBill () {
         	
         	final_bill = bill - (bill * dis);
         	
         	return final_bill;
         	
   	}
   	
}
 
 
public class Task3 {
 
   	public static void main(String[] args) {
         	// TODO Auto-generated method stub
         	
         	ImtiazStore X= new ImtiazStore(2000);
         	System.out.println("Bill after 7% discount: "+X.getBill());
         	
         	BinHashimStore Y = new BinHashimStore(2000);
         	System.out.println("Bill after 5% discount : "+ Y.getBill());
         	
   	}
 
}
