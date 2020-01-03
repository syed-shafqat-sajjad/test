import java.util.Scanner;
public class cal {
public static void main(String[] args)
{
Calculator c = new Calculator();	
int option=0;
int n1,n2,m1;
Scanner input = new Scanner(System.in);	

	do {

	System.out.println("Main Menu");
	System.out.println(" 1 sum");
	System.out.println("2 mult");
	System.out.println("3 Exit");
	System.out.println("Enter any option to continue: ");
	option=input.nextInt();
	
	System.out.println("enter num 1");
	n1=input.nextInt();
	System.out.println("enter num 2");
	n2=input.nextInt();
	
	switch(option)
	{
	case 1:
		System.out.println(c.sum(n1, n2));
		break;
		
	case 2:	
		System.out.println(c.mult(n1, n2));
		break;
	case 3:
		System.out.println("Program exited");
		break;
		
	default:
		break;
		

	}
	
}
while(option!=4);

}
}
