class Trapezoid
{
	double area()
	{
int a=5;
int b=6;
int h=8;
double res=0.5*(a+b)*h;
return res;
}
public static void main(String[]args)
{
Trapezoid T=new Trapezoid();
double x=T.area();
System.out.println(x);
}
}