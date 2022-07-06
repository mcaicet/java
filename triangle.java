package graphics;
import java.util.Scanner;
interface areas
{
 void area();
}
public class triangle implements areas
{
  int l,b,h;
  public void area()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Input length");
    l=sc.nextInt();
    System.out.println("Input breadth");
    b=sc.nextInt();
    System.out.println("Input height");
    h=sc.nextInt();
    String area=Double.toString((l*b*h)/2f);
    System.out.println("Area of triangle: "+area);
   }
}
  
