class Redbus
{
	void ticket()
	{
		System.out.println("book ticket");
	}
}
class Airavata extends Redbus
{
	void ticket()
	{
		System.out.println("Airavatha ticket");
	}
}
class VRL extends Redbus
{
	void order(){
		System.out.println("VRL ticket");
	}
}
class janata extends Redbus
{
	void book(){
		System.out.println("janata ticket");
}
}
class Stimulator 
{
	static void ticket(Redbus t1)
	{
             t1.ticket();
	}
}
class Mainclass5
{
	public static void main(String[]args)
	{
	Airavata B1=new Airavata();
	VRL C1=new VRL();
	janata A1=new janata();
	Stimulator.ticket(B1);
	Stimulator.ticket(C1);
	Stimulator.ticket(A1);
}
}