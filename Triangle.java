class Triangle
{
	public double area()
	{
		int a=3;
		int b=4;
		double c= 0.5*a*b;
		return c;
	}
		public static void main(String [] args)
		{
			
			double x=new Triangle().area();
			System.out.println(x);
		}
}