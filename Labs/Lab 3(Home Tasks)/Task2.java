import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name,T;
       
       try
       {
	       Scanner sc= new Scanner(System.in);
	       System.out.println("Enter charcters from A to Z either in small or caps");
	       name= sc.nextLine();
	       if(name != name.toUpperCase())
	       {
	    	   System.out.println("Invalid Entry");
	    	   
	       }
	       else
	       {
	       
		       for(int i=0;i<=name.length()-1;i++)
		       {
		    	  if((name.charAt(i)<'A' && name.charAt(i)>'Z') || (name.charAt(i)<'a' && name.charAt(i)>'z'))
		    	  {
		    		  invalidCharacter me = new invalidCharacter("You entered an invalid character");
		                    throw me;
		    	  }
		       }
	       }
    	   
       }
       catch (invalidCharacter e) {
		System.out.println("Some Error Occured");
           e.printStackTrace();
       }
       
	}

	}

