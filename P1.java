import java.util.*;
class P1
{
   public static void main(String []args)
{
   int []a=new int[]{10,20,30,40,50};
int sum=0,i,avg;
   for(i=0;i<a.length;i++)
{
    sum=a[i]+sum;
   }
avg=sum/a.length;
 System.out.println(sum);
System.out.println(avg);
}
}