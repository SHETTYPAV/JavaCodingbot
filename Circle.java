class Circle
{
double area()
	{
int r=8;
double pi=3.14;
double res=pi*r*r;
return res;
}
public static void main(String[] args)
{
Circle C=new Circle();
double x=C.area();
System.out.println(x);
}
}