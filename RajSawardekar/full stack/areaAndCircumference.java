package assignment2;

public class areaAndCircumference {
void area(int r)
{
double pi=3.14,area;
area=pi*r*r;
System.out.println("Area of circle is:"+area);

}
void circumference(int r)
{
double pi=3.14,circumference;
circumference=2*pi*r;
System.out.println("Circumference of circle is:"+circumference);

}
public static void main(String args[])
{
	areaAndCircumference obj=new areaAndCircumference();
	obj.area(4);
	obj.circumference(6);
}
}