import java.util.*;
class P18{
public static void main(String[] args){
	if(args.length==0)
	{	
		System.out.println("Enter a number.");
		System.exit(0);
	}
	int p=Integer.parseInt(args[0]),m,k=0,p1;
	p1=p;
	while(true)
	{
		if(p1!=0)
		{
			m=p1%10;
			k=k*10+m;
			p1=p1/10;
		}
		else
		break;
	}
	if(p==k)
	System.out.println(p+" is a palindrome.");
	else
	System.out.println(p+" is not a palindrome.");
	}	
}