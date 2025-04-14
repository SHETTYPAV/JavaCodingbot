class Circle
{
 public  double area()
	{
	 final double pi=3.14;
	 int r=5;
	 double res=pi*r*r;
	 return res;
	}
}
class C
	{
	public static void  main(String[] args)
	{
		double c=new Circle().area();
		 System.out.println(c);
		
	}
}