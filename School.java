class School
{
static String schoolname="Don Bosco School";
char grade;
int strength;
public static void main(String[]args)
{
System.out.println("School Name is "+schoolname);
School S=new School();
S.grade='A';
System.out.println(S.grade);
School S1=new School();
S1.strength=400;
System.out.println(S1.strength);
}
}