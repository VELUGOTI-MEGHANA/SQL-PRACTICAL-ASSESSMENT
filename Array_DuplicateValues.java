package Assignment_1;

public class Array_DuplicateValues {
//void main
	public static void main(String arg[]) {
		  int a[]= {3,4,6,8,3,5,4,8};  //initialize array
		     for(int i=0;i<a.length;i++) // 'for' loop for i 
		     {
		    	 for(int j=i+1;j<a.length;j++) 
		    		                     //'for' loop for j  
		    	 {
		    		 if(a[i]==a[j])    // compares two array  two find duplicate element
		    			 
		    		 System.out.print(a[j]+" ");  //prints the duplicate values
		    	 }
		     }
		 }  

	}