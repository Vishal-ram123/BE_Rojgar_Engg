package Logical_Program;

public class String_split_Me 
{
	public static void main(String[] args) {
		
		String s="Ajay Love Cricket";
		
		String[] ar=s.split(" ");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
