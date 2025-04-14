class TV
{
static  String TV_brand="LG";
String Tvtype;
int TV_cost;
public static void main(String []args)
{
System.out.println("TV brand  is"+TV_brand);
TV T=new TV();
T.Tvtype="LED";
System.out.println(T.Tvtype);
TV T1=new TV();
T1.TV_cost=100000;
System.out.println(T1.TV_cost);
}
}
