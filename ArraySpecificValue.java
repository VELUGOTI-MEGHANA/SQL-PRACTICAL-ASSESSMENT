package Assignment_1;

public class ArraySpecificValue {
//void main
	public static void main(String arg[]) {
		//initialize array
		int arr[]= {10,20,30,40,50};
		int n=20;
		for(int i=0;i<arr.length;i++)  //using for loop for i
		{
			if(arr[i]==n)  
			{
				System.out.println("array contains given element:"+i); 
				break;
			
			}
			else if(i==(arr.length-1))
			{
				System .out.println("not contains");
				break;
			}
			else
			{
				continue;
			}
		}
		
	}
	
}
