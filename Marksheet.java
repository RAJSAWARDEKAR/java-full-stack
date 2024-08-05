package assignment2;
import java.util.Scanner;
public class Marksheet {

	public static void main(String[] args) {
		int marks[]=new int[6];
		int i;
		int tot=0 , fs=0;
		float per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 Subject marks(Out of 100):");
		for(i=0;i<6;i++)
		{
			marks[i] = sc.nextInt();
			tot = tot+marks[i];
		}
		per =(float)((tot/600)*100);
		
		for(i=0;i<6;i++)
		{
			fs=fs+1;
		}
	
	if(fs>3)
	{
		System.out.println("Failed");
	}
	else if (fs>0 && fs<=3)
	{
		System.out.println("KT");
	}
	else
	{
		System.out.println("Passed");
	}
	
	}

}
