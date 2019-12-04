import java.util.*;
class P5{
public static void main(String[] args){
char a,b;
Scanner sc=new Scanner(System.in);
a=sc.next().charAt(0);
if(a>='0' && a<='9')
System.out.println("Digit");
else if(a>='a' && a<='z')
System.out.println("Alphabet");
else
System.out.println("Special Characters");
}
}