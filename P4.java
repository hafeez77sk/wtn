import java.util.*;
class P4{
public static void main(String[] args){
char a,b;
Scanner sc=new Scanner(System.in);
a=sc.next().charAt(0);
b=sc.next().charAt(0);
if(a>b)
{
System.out.println(b);
System.out.println(a);
}
else
{
System.out.println(a);
System.out.println(b);
}
}
}