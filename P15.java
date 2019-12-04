import java.util.*;
class P15{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt(),i,k=0,m=0;
	for(i=0;a!=0;i++)
	{
		m=a%10;
		k=k+m;
		a=a/10;
	}
	System.out.println(k);
	
	}	
}