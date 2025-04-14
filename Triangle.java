class Triangle
{
public void area(int h,int b)
	{
	double res=0.5*b*h;
	System.out.println(res);
	}
	public static void main(String [] args)
	{
		Triangle T1=new Triangle();
		T1.area(5,8);
	}
}
