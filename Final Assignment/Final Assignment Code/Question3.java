public class Question3 
{
	    public static <E extends Comparable<E>> int linearSearch(E[] list, E value) 
	    {
	        for (int i = 0; i < list.length; i++) //run through entire list to look for specific key
	        {
	            if (list[i].compareTo(value) == 0) 
	            {
	                return i;
	            }
	        }
	      return -1; //this is for if the number is not in the list
	    }
	    
	    public static void main(String[] args) 
		 {
			 Integer[] list = {3, 4, 5, 1, -3, -5, -1};
		     System.out.println(linearSearch(list, 2)); //find if 2 is in the list (not there so we should get a -1)
		     System.out.println(linearSearch(list, 5)); // find if 5 is in the list (counting from 0 so we should get a 2)
		 }
}