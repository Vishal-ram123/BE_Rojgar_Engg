package Logical_Program;

public class String_split {

	public static void main(String[] args)
	{
		String a="Ajay Deshmukh Like";
		
		String[] ar=a.split(" ");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String org=ar[i];
			String rev="";
			for(int j=org.length()-1;j>=0;j--)
			{
				rev=rev+org.charAt(j);
		}
			System.out.print(rev+" ");
		}

	}

}
