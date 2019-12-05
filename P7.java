import java.util.*;
class P7
{
public static void main(String args[])
{
int a[]={10,20,10,90,87,90,87};
int i,j;
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
a[j]=0;
}
if(a[i]!=0)
System.out.print(+a[i]+",");
}
}
}