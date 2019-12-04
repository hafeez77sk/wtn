import java.util.*;
class P14{
public static void main(String[] args){
	if(args.length==0)
	{
		System.out.println("Please enter an integer number");
		System.exit(0);
	}
	else
	{
		int p=Integer.parseInt(args[0]),i,k=0;
		if(p<=1)
			System.out.println(p+" is neither prime nor composite");
		else
		{
			for(i=2;i<=Math.sqrt(p);i++)
			{
				if(p%i==0)
				{
					k=1;
					break;
				}
			}
			if(k==1)
			System.out.println(p+" is not a prime number");
			else
			System.out.println(p+ " is a prime number");
		}
	}
	}	
}