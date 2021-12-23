package Assignment_1;

public class LargeNumbers {
	//Void main
	public static void main(String arg[]) {
			int arr[] = {3,4,5,6,3,2,4,};//initialize array
			int a = arr[0];
			int b = arr[1];
			for(int i=2;i<arr.length;i++)	//'for' loop for i	
			{
				if(arr[i]>a)
				{
					int temp = a;
					a = arr[i];
					b = temp;
				}
				else if(arr[i]>b&& arr[i]<=a)
				{
					a= arr[i];
				}
			}

			System.out.println("first largest number is:" +a);  //prints the value
			System.out.println("second largest number is:" +b);  //prints the value
			
			
		}


}
