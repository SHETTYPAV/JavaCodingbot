class Rectangle
{
public int area()
{
int a=5;
int b=6;
int res=a*b;
return res;
}
public static void main(String[]args)
{
Rectangle R=new Rectangle();
int x=R.area();
System.out.println(x);
}
}