import java.util.*;
class P5
{
public static void main(String args[])
{
int a[]={10,87,90,76,67,45,89};
int i,min1,min2,max1,max2;
max1=a[0];
max2=a[1];
min1=a[0];
min2=a[1];
for(i=1;i<a.length;i++)
{
if(a[i]>max1)
{
max2=max1;
max1=a[i];
}
else if (a[i] >max2 && a[i]!=max1)
			{
				max2 = a[i];
			}


if(a[i]<min1)
{
min2=min1;
min1=a[i];
}
else if(a[i]<min2&&a[i]!=min1)
{
min2=a[i];
}

}
System.out.println("the max and min are "+max1+" "+max2+" "+min1+" "+min2);
}
}