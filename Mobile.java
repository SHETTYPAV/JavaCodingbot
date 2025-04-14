class Mobile
{
int cost;
static String mob_name="Vivo";
String colour;
public static void main(String[]args)
	{
	System.out.println("Mobile nameis"+mob_name);
	Mobile M=new Mobile();
	M.cost=30000;
	System.out.println(M.cost);
	Mobile M1=new Mobile();
	M1.colour="Blue";
	System.out.println(M1.colour);
	}
}