class A3
{
	public static void main(String[]args)
	{
		short[]arr=new short[2];
		arr[0]=10;
		arr[1]=20;
		System.out.println("*******************");
		System.out.println("index \tvalues");
		System.out.println("*******************");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+" \t"+arr[i]);
		}
}
}