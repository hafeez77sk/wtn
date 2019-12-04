import java.util.*;
class P16{
public static void main(String[] args){
	if(args.length==0)
	{
		System.out.println("Please enter an integer number");
		System.exit(0);
	}
	else
	{
		int p=Integer.parseInt(args[0]),m,k=0;
		for(m=0;m<p;m++)
		{
			for(k=0;k<=m;k++)
			System.out.printf("*");
			System.out.println();
		}
	}
	}	
}