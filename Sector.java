class Sector
{
void area()
{
int r=6;
double t=5.6;
double res=0.5*r*r*t;
System.out.println(res);
}
public static void main(String[]args)
{
Sector S=new Sector();
S.area();
}
}