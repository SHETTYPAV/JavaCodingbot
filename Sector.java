class Sector
{
double area()
{
int r=6;
double t=5.6;
double res=0.5*r*r*t;
return res;
}
public static void main(String[]args)
{
Sector S=new Sector();
double x=S.area();
System.out.println(x);
}
}