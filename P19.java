import java.util.*;
class P19{
public static void main(String[] args){
	int p=1,m=0;
	while(p<=5)
	{
		if(p%2==0 && p%3==0 && p%5==0)
		{
			System.out.println(p);
			m++;
		}
		p++;
	}
	if(m==0)
	System.out.println("Neither of the numbers are divisible by 2, 3 and 5.");
	}	
}