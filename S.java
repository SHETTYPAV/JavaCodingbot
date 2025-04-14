class Sector
{
 public  double area()
	{
	 double t=2.14;
	 int r=5;
	 double res=0.5*r*r*t; 
	 return res;
	}
}
class S
{
	public static void main(String [] args)
	{
		double c=new Sector().area();
		System.out.println(c);
	}
}