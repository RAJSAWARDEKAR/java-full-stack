package first;
import java.util.Scanner;


public class Queue {
	 int front= 0;
	 int rear= -1;
	 int size=5;
	 int que[] = new int[5];
			 
			 
			 void push(int value ) {
		 if(isFull()==true) {
			 System.out.println("Queue is Full" );
		 }
		 else {
			 rear++;
			 que[rear]=value;
		 }
	 }
			 
	 
			 boolean isFull() {
		 if(rear==size-1)
		 {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
			 void display() {
		 if(isEmpty()==true) {
			 System.out.println("Queue is Empty");
		 }
		 else {
			 System.out.println("Queue is:");
			 for(int i=front;i<=rear;i++) {
				 System.out.println(que[i]+"");
				 
			 }
		 }
	 }
	 
			 boolean isEmpty() {
		 if(rear==-1) {
			 
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
			 void pop() {
		 if(isEmpty()==true) {
			 System.out.println("Queue is Empty" );
		 }
		 else {
			 System.out.println("Queue is:");
			 for(int j=front+1;j<=rear;j++) {
				 que[j-1]=que[j];
			 }
			 rear--;
		 }
	 }
	 
	 public static void main(String[] args) {
		 Queue obj = new Queue(); 
		 int ch=1;
		 while(ch==1) {
			 System.out.println("1.push\n2.pop\n3.display");
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter a choice");
			 int ch1=sc.nextInt();
			 switch(ch1){
			 case 1:
				 System.out.println("Enter a value");
				 int val=sc.nextInt();
				 obj.push(val);
				 obj.display();
				 break;
			 case 2:
				 obj.pop();
				 obj.display();
				 break;
			 case 3:
				 obj.display();
				 break;
			 default:
				 System.out.println("invalid choice");
				 
			 }
			 
			 System.out.println("\n Are you want to continue yes(1)/no(0)");
			 ch=sc.nextInt();
			 
		 }
		 
	 }
	 
}




	 
	 
	 
		 
	
	 
	  
	  
