import java.util.*;
import java.io.*;
class Box{
int width=10;
int height=20;
double depth=20;
void vol(int width,int height,double depth){
this.width=width;
this.height=height;
this.depth=depth;
}
double volume(int width,int height,double depth){
double v;
v=width*height*depth;
return(v);
}
}
class P41{
public static void main(String k[]){
Box b=new Box();




System.out.println("th "+b.volume(10,20,20));
}
}
