import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name,T;
       
       try
       {
	       Scanner sc= new Scanner(System.in);
	       System.out.println("Enter String in Capital Letters: ");
	       name= sc.nextLine();
	       if(name != name.toUpperCase())
	       {
	    	   System.out.println("Invalid Entry");
	    	   
	       }
	       else
	       {
	       
		       for(int i=0;i<=name.length()-1;i++)
		       {
		    	  if(name.charAt(i)=='A' || name.charAt(i)=='B')
		    	  {
		    		  Exception1 me = new Exception1(" A ");
		                    throw me;
		    	  }
		       }
	       }
    	   
       }
       catch (Exception1 e) {
		System.out.println("Some Error Occured");
           e.printStackTrace();
       }
       
	}

	}

