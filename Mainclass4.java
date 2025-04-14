class Zomata
{
	void order()
	{
		System.out.println("order food");
	}
}
class hotel1 extends Zomata
{
	void order()
	{
		System.out.println("order pizza");
	}
}
class hotel2 extends Zomata
{
	void order(){
		System.out.println("order puliyogare");
	}
}
class hotel3 extends Zomata
{
	void order(){
		System.out.println("order bisibelebath");
}
}
class Stimulator 
{
	static void order(Zomata t1)
	{
             t1.order();
	}
}
class Mainclass4
{
	public static void main(String[]args)
	{
	hotel1 B1=new hotel1();
	hotel2 C1=new hotel2();
	hotel3 A1=new hotel3();
	Stimulator.order(B1);
	Stimulator.order(C1);
	Stimulator.order(A1);
}
}