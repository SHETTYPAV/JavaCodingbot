class Triangle
{
public void area()
	{
	int h=8;
	int b=6;
	double res=0.5*b*h;
	System.out.println(res);
	}
	public static void main(String [] args)
	{
		Triangle T1=new Triangle();
		T1.area();
	}
}
