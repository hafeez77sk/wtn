import java.util.*;
class P7{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	char s=sc.nextLine().charAt(0),a;
	if(s>='a' && s<='z')
	a=(char)(s-32);
	else
	a=(char)(s+32);
	System.out.println("Old Value: "+s);
	System.out.println("New Value: "+a);
	}
}