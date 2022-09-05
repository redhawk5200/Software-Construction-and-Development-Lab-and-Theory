class Bank{
   	
   	protected double balance;
   	
 
   	public Bank(){
         	balance =0;
         	
   	}
   	
   	public double getBalance()
   	{
         	return balance;
         	
   	}
   	
}
class BankA extends Bank{
   	
   	public BankA(double x){
         	 balance=x;
         	 
   	}
   	@Override
   	public double getBalance()
   	{
         	return balance;
   	}
}
 
class BankB extends Bank{
   	
   	public BankB(double x){
         	 balance=x;
         	 
   	}
   	@Override
   	public double getBalance()
   	{
         	return balance;
   	}
}
class BankC extends Bank{
   	
   	public BankC(double x){
         	 balance=x;
         	 
   	}
   	@Override
   	public double getBalance()
   	{
         	return balance;
   	}
}
public class Task2 {
   	public static void main(String[] args){
         	
   	Bank B = new Bank();
   	System.out.println("balance is "+B.getBalance());
   	
   	B = new BankA(1000.00);
   	System.out.println("balance is "+B.getBalance());
   	
   	B = new BankB(1500.00);
   	System.out.println("balance is "+B.getBalance());
   	
   	B = new BankC(2000.00);
   	System.out.println("balance is "+B.getBalance());
}
   	
}
