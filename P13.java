import java.util.*;
class P13{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int p,i,k=0;
	for(p=10;p<=99;p++)
	{
		k=0;
		for(i=2;i<=Math.sqrt(p);i++)
		{
			if(p%i==0)
			{
				k=1;
				break;
			}
		}
		if(k!=1)
		System.out.println(p);
	}
	}	
}