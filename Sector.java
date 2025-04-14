class Sector
{
 public void area()
	{
	 double t=2.14;
	 int r=5;
	 double res=0.5*r*r*t;
	 return res;
	}
	public static void main(String [] args)
	{
		int x=new Sector().area();
		System.out.println(x);
		
	}
}