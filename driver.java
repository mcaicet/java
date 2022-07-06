import graphics.*;
import java.util.Scanner;
public class driver
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int choice;
circle c=new circle();
rectangle r=new rectangle();
square s=new square();
triangle t=new triangle();
System.out.println("Choose any 1)Circle 2)Rectangle 3)Square 4)Triangle");
choice=sc.nextInt();
switch(choice)
{
case 1:
c.area();
break;
case 2:
r.area();
break;
case 3:
s.area();
break;
case 4:
t.area();
break;
default:
break;
}
}
}

