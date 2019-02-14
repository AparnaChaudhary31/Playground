import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner read = new Scanner(System.in);
    int base = read.nextInt();
    int exponent = read.nextInt();
    int res = power(base,exponent);
    System.out.println(res);
  }
  public static int power(int base, int exponent)
  {
    int res = 1;
    for(int i = 1; i <= exponent; i ++)
    {
      res = res * base;
    }
    return res;
  }
}