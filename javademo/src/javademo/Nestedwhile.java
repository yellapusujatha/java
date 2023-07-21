package javademo;

public class Nestedwhile {
	 public static void main(String args[])
	    {
	        int i=1;
	        
	        while(i<=3)
	        {
	            System.out.println("\n"+i+" "+"outer loop \n");
	            
	            int j=1;
	            
	            while(j<=4)
	            {
	                System.out.println(j+" "+"inner loop");
	                j++;
	            }
	            
	            i++;
	        }
	    }
	}


