class Bookmyshow
{
	void book()
	{
		System.out.println("book show");
	}
}
class sandalwood extends Bookmyshow
{
	void book()
	{
		System.out.println("Sandalwood.....");
	}
}
class bollywood extends Bookmyshow
{
	void book(){
		System.out.println("bollywood......");
	}
}
class hollywood extends Bookmyshow
{
	void book(){
		System.out.println("hollywood.....");
}
}
class Stimulator 
{
	static void book(Bookmyshow t1)
	{
             t1.book();
	}
}
class Mainclass3
{
	public static void main(String[]args)
	{
	sandalwood B1=new sandalwood();
	bollywood C1=new bollywood();
	hollywood A1=new hollywood();
	Stimulator.book(B1);
	Stimulator.book(C1);
	Stimulator.book(A1);
}
}