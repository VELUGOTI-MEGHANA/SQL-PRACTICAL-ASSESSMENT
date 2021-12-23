package Assignment_1;

public class HighestDuplicate {
	public static void main(String[] args) {
		int arr[] = {1,6,4,3,4,3,2,5,8,9}; //initalize array
		int max = 0;
		int element = 0;
		for(int i=0;i<arr.length;i++)  //'for' using for i
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) //checks for the repeated elements and increases count
				{
					count++;
				}
			}
			if(max<count)
			{
				max=count;
				element=arr[i];
			}
		}

		System.out.println("The Max Repeated Number is and count is : "+element+", " +max);
	}
}
