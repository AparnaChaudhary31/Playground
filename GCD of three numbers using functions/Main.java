import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner read = new Scanner(System.in);
  int n1 = read.nextInt();
  int n2 = read.nextInt();
  int n3 = read.nextInt();
  int res = gcd(n1,n2);
  res = gcd(n3, res);
  System.out.println(res);
}
  public static int gcd(int n1, int n2)
  {
   int result = 1;
   if(n1 > n2)
   {
     int temp = n2;
     n2 = n1;
     n1 = temp;
   }
   for(int minimum = n1; minimum >= 0; minimum --)
   {
       if(n1 % minimum == 0 && n2 % minimum == 0)
       {
         result = minimum;
         break;
       }
   }
   return result;
  }
}
