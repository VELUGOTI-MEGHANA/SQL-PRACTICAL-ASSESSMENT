package Assignment_1;

public class Sum_Array {
//void main
	public static void main(String arg[]) {
		//initialize array
		int arr[] = {2,3,4,6,7};
		int i,sum=0;
	
		for(i=0;i<arr.length;i++) //'for' loop for i
		{
			sum=sum+arr[i];
			}
		System.out.println("sum of all the elements of an array:" +sum);
	}
}