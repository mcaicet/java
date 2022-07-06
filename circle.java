package graphics;
import java.util.Scanner;
interface areas
{
 void area();
}
public class circle implements areas
{
  int r;
  public void area()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Input radius");
    r=sc.nextInt();
    String area=Double.toString(Math.PI*r*r);
    System.out.println("Area of circle: "+area);
    sc.close();
   }
}
  
