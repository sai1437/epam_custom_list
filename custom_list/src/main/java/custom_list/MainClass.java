package custom_list;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MainClass {
	
	private static final Logger LOGGER =LogManager.getLogger(MainClass.class);
	 public static void main(String[] args) 
	    {
		    
		 	@SuppressWarnings("resource")
			Scanner sc =new Scanner(System.in);
	        My_Custom_List<Integer> list = new My_Custom_List<Integer>();
	 
	        LOGGER.info("Adding elements to the list");
	        int n;
	        LOGGER.info("enter no of elements to the added to then list");
	        n=sc.nextInt();
	        for(int i=0;i<n;i++) 
	        {
	        	LOGGER.info("enter the element:"+i);
	        	int element=sc.nextInt();
	        list.add(element);
	        }
	        LOGGER.info("dislaying the list elements");
	        System.out.println(list);
	         
	        LOGGER.info("removing elemnts in the list");
	        list.remove(2);
	        System.out.println(list);
	         
	        LOGGER.info("fetching the elements based on index value");
	        System.out.println( list.get(0) );
	        System.out.println( list.get(1) );
	 
	        LOGGER.info("printing the list size");
	        System.out.println(list.size());
	    }

}
