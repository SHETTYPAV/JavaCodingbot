class A8
{
	public static void main(String[]args)
	{
		char[]arr=new char[2];
		arr[0]='A';
		arr[1]='B';
		System.out.println("*******************");
		System.out.println("index \tvalues");
		System.out.println("*******************");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+" \t"+arr[i]);
		}
}
}