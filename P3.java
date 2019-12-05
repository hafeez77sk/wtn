import java.util.*;
class P3
{
   public static void main(String []args)
{
  int []a=new int[]{4,8,34,54,2};
int i,c=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
  for(i=0;i<a.length;i++)
{ 
   if(a[i]==n)
  { 
System.out.println(i);
break;
 } 

 else
{
    c++; 
}
 
  }
if(c>0)
{
    System.out.println("-1");
}

 
   
}
}