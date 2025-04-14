class Sector
{
 public void area()
	{
	 double t=2.14;
	 int r=5;
	 double res=0.5*r*r*t;
	 System.out.println(res);
	}
	public static void main(String [] args)
	{
		new Sector().area();
		
	}
}