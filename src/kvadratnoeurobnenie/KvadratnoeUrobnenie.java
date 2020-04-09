package kvadratnoeurobnenie;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class KvadratnoeUrobnenie {
    static float a,b,c;
    static float d;
    static double x1, x2;
    public static void main(String args []) throws IOException
    {
    try{
        System.out.println("Решение квадратного уравнения A*x2 +B*x + C=0");
        Scanner s = new Scanner(System.in);
        System.out.print("Введите значение a ");
        a = s.nextFloat();
        System.out.print("Введите значение b ");
        b = s.nextFloat();
        System.out.print("Введите значение c  ");
        c = s.nextFloat();
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        d = (b * b) - (4 * a * c);
        System.out.println("Дискриминант " + d);
        if(d < 0)
         System.out.print("Если дискриминант отрицательный, то действительные корни отсутствуют. "
                 + "Уравнение не имеет решений");
        else
        if(d == 0)
          {
            x1 = (-b) / (2 * a);
             System.out.println ("x = " + x1);
           }
           else
           {
              x1 = (-b + Math.sqrt(d)) / (2 * a);
              x2 = (-b - Math.sqrt(d)) / (2 * a);
               if (x1 != x2)
                   System.out.println ("x1 =  " + x1 + "  x2 = " + x2);
                 else
                   System.out.println ("x1 = x2 " + x1);
            }
        }catch(InputMismatchException e){System.out.println("!!!Ошибка ввода!!!");}
      }
}
