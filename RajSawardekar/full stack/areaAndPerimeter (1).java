package assignment3;

public class areaAndPerimeter {
	
	void area(int l,int b)
	{
	    int c;
		c=l*b;
		System.out.println("area is:"+c);
		
	}
	void perimeter(int l,int b)
	{
	    int c;
		c=2*(l+b);
		System.out.println("perimeter is:"+c);
		
	}
	public static void main(String args[]) {
	areaAndPerimeter y=new areaAndPerimeter ();
	y.area(5, 4);
	y.perimeter(4,5);
	}
}