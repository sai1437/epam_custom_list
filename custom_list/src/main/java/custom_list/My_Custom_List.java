package custom_list;

import java.util.Arrays;

public class My_Custom_List<S> {
	
	//size initialize to zero
	private int size=0;
	
	private int minimum_elements=3;
	
	private Object array[];
	
	public My_Custom_List() {
        array = new Object[minimum_elements];
    }
	 //Add method
    public void add(S e) {
        if (size == array.length) {
            ensureCapacity();
        }
        array[size++] = e;
    }
     
    //Get method
    //@supperssWarning tells the compiler that the programmer believe that the code is safe don,t causes unexpected exceptions
    @SuppressWarnings("unchecked")
   
    public S get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (S) array[i];
    }
     
    //Remove method to remove the elements
    @SuppressWarnings("unchecked")
    public S remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = array[i];
        int numElts = array.length - ( i + 1 ) ;
        
        System.arraycopy( array, i + 1, array, i, numElts ) ;
        size--;
        return (S) item;
    }
     
    //Get Size of list
    public int size() {
        return size;
    }
     
    //Print method
    @Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(array[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    //ensure capacity method doubles the size of the list when ever the no of elements in the 
    private void ensureCapacity() {
        int newSize = array.length * 2;
        //copying the new size of array
        array = Arrays.copyOf(array, newSize);
    }
}


