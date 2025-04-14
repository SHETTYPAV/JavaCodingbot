abstract class Sample1
{
	 abstract void cool();
	 abstract void fo();
}
class Demo1 extends Sample1
{
	void cool()
	{
		System.out.println("i am cool");
	}
	void fo()
	{
		System.out.println("i am fo");
	}
}

class Mainclass
{
	public static void main(String[]args)
	{
		Demo1 d1=new Demo1();
		d1.cool();
	    d1.fo();
}
}
