
interface intfC
{
	void replace(String s);
}

interface intfD
{
	void reverse(String s);
}

interface intfE extends intfC, intfD
{
	void delete(String s);
}

class Samplee implements intfC
{
	public void replace(String s)
	{
		StringBuilder a = new StringBuilder(s);
		System.out.println(a.replace(0, 3, "xyz"));
	}

	public void reverse(String s)
	{
		StringBuilder a = new StringBuilder(s);
		System.out.println(a.reverse());
	}

	public void delete(String s)
	{
		StringBuilder a = new StringBuilder(s);
		System.out.println(a.delete(1, 4));
	}
}

public class Interface2{
	
	public static void main (String[] args)
	{
		String s = "abcdefg";
		String s1 = "hijklmn";
		Samplee ob2 = new Samplee();

		ob2.replace(s);
		ob2.reverse(s1);
		ob2.delete(s);
	}
}
