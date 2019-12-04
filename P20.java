import java.util.*;
class P20{
public static void main(String[] args){
	int p,m;
	char c;
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("1.Add\n2.Subtraction");
		p=sc.nextInt();
		switch(p)
		{	
			case 1:
			System.out.println("Enter the values for 2 operands: Addition");
			p=sc.nextInt();
			m=sc.nextInt();
			System.out.println(" Addition of "+p+" and "+m+" is: "+(p+m));
			break;
			case 2:
			System.out.println("Enter the values for 2 operands: Subtraction");
			p=sc.nextInt();
			m=sc.nextInt();
			System.out.println(" Subtraction of "+p+" and "+m+" is: "+(p-m));
			break;
			default:
			System.out.println("Enter valid option");
			continue;
		}
		System.out.println("To continue  press y(or)Y .\nTo abort press n(or)N.");
		c=sc.next().charAt(0);	
		if(c=='y' ||c=='Y')
		continue;
		else
		{
			System.out.println("Program terminating..");
			break;
		}	
	}while(true);
	}	
}