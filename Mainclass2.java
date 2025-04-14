class Tea
{
	void taste()
	{
		System.out.println("taste is good");
	}
}
class Green_tea extends Tea
{
	void taste()
	{
		System.out.println("taste is nice");
	}
}
class Black_tea extends Tea
{
	void taste(){
		System.out.println("taste is good");
	}
}
class Lemon_tea extends Tea
{
	void taste(){
		System.out.println("taste is ossum");
}
}
class Stimulator 
{
	static void taste(Tea t1)
	{
             t1.taste();
	}
}
class Mainclass2
{
	public static void main(String[]args)
	{
	Green_tea B1=new Green_tea();
	Black_tea C1=new Black_tea();
	Lemon_tea A1=new Lemon_tea();
	Stimulator.taste(B1);
	Stimulator.taste(C1);
	Stimulator.taste(A1);
}
}