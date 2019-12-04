class P6{
public static void main(String[] args){
	int a=Integer.parseInt(args[1]);
	if(args[0].equals("Male"))
	{
		if(a>=1 && a<=60)
		System.out.println("Interest: 9.2%");
		else if(a>=61 && a<=120)
		System.out.println("Interest: 8.3%");
	}
	else if(args[0].equals("Female"))
	{
		if(a>=1 && a<=58)
		System.out.println("Interest: 8.2%");
		else if(a>=59 && a<=120)
		System.out.println("Interest: 7.6%");
	}
	}
}