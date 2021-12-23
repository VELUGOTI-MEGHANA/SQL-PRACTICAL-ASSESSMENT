package Assignment_1;

public class String_oval {
//void main
	public static void main(String arg[]) {
		
		String str="String element";//input string
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++)//using for loop 
		{
			if (c[i]=='a'|| c[i]=='e'|| c[i]=='i'||  c[i]=='o'||  c[i]=='u')
			{
				c[i]='$';
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
		}
}
