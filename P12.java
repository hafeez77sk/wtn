import java.util.*;
class P12{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int p=sc.nextInt(),i,k=0;
	if(p>1)
	for(i=2;i<=Math.sqrt(p);i++)
	{
		if(p%i==0)
		{
			k=1;
			break;
		}
	}
	else
	k=1;
	if(k==1)
	System.out.println(p+" is not a Prime Number");
	else
	System.out.println(p+ " is a Prime Number");
	}	
}