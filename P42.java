import java.util.*;
import java.io.*;
class Calculator{
public static double powerInt(int n1,int n2)
{

double u=Math.pow(n1,n2);
return (u);
}
public static double powerDouble(double n1,int n2)
{
double p=Math.pow(n1,n2);
return(p);
}
}
class P42{
public static void main(String k[]){
System.out.println("powerint="+Calculator.powerInt(12,10));
System.out.println("powerDouble="+Calculator.powerDouble(12.000,10));
}
}


