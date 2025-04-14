class Indianrailway
{
void train(){
System.out.println("book train");
}}
class IR{
static void book(Indianrailway P2)
{
P2.train();
}}
class Customer{
public static void main(String []args){
Indianrailway P1=new Indianrailway();
IR.book(P1);
}}
