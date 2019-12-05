import java.util.*;
class P2
{
   public static void main(String []args)
{
   int []a=new int[]{10,20,30,40,50};
int max,min,i;
min=a[0];
max=a[0];
for(i=0;i<a.length;i++)
{  
   if(a[i]<min)
  {  
    min=a[i];
}
 if(a[i]>max)
{
  max=a[i];
}

}

System.out.println(min);
System.out.println(max);
}
}