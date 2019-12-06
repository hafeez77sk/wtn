import java.util.*;
import java.io.*;
class Patient {
String s ;
double w=72;
double h=157;

double BMI(String s,double w,double h){
double p=(w/(h*h))*703;
return p;
}
}
class P43{
public static void main(String k[]){
Patient p=new Patient();
System.out.println("BMI of patient is="+p.BMI("Rishi",72,157));
}
}