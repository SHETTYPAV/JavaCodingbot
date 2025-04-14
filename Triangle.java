class Triangle
{
public double area()
	{
	int h=8;
	int b=6;
	double res=0.5*b*h;
	return res;
	}
	public static void main(String [] args)
	{
		Triangle T1=new Triangle();
		double x=T1.area();
		System.out.println(x);
	}
}