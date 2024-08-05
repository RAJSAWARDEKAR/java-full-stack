package assignment2;
import java.util.*;

public class Prime {
		public static void main(String args[]) {
			int i=0;
			int j=0;
			String primeNum= " ";
			
			for(i=0;i<=100;i++)
			{
				int counter=0;
				for(j=i;j>=1;j--)
				{
					if(i%j==0) {
						counter=counter+1;
						
					}
				}
				    if(counter==2) {
				    	primeNum= primeNum + i +"  "+"  ";
				    }
			}
		        System.out.println("Prime number of 1 tp 100 are");
		        System.out.println(primeNum);
		}

	}



