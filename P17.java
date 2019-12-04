import java.util.*;
class P17{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int p=sc.nextInt(),m,k=0;
	System.out.println("The given value is: "+p);
	System.out.printf("Reverse of %d is: ",p);
	while(true)
	{
		if(p!=0)
		{
			m=p%10;
			k=k*10+m;
			p=p/10;
		}
		else
		break;
	}
	System.out.printf("%d",k);
	}	
}