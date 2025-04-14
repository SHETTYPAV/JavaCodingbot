class Cloth
{
	static String cloth_size="M";
	int cost;
	String colour;
	public static void main(String[]args)
	{
		System.out.println("cloth size is " + cloth_size);
		Cloth C=new Cloth();
		C.cost=500;
		System.out.println(C.cost);
		Cloth C1=new Cloth();
		C1.colour="brown";
		System.out.println(C1.colour);
	}
}