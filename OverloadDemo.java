import java.util.Scanner; 
class OverloadDemo
{
void area(float x)
{
System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
}
void area(float x, float y)
{
System.out.println("the area of the rectangle is "+x*y+" sq units");
}
void area(double x)
{
double z = 3.14 * x * x;
System.out.println("the area of the circle is "+z+" sq units");
}
}
class Method_over1
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in); System.out.println("Enter the side of the square:-\n"); float x = s.nextFloat();
System.out.println("Enter the length and breadth of the rectangle:-\n"); float l = s.nextFloat();
float b = s.nextFloat();
System.out.println("Enter the radius of the circle:-\n"); double r = s.nextDouble();
OverloadDemo ob = new OverloadDemo(); ob.area(x);
ob.area(l,b);
ob.area(r);
}
}

