import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner read = new Scanner(System.in);
    int n1 = read.nextInt();
    int n2 = read.nextInt();
    int n3 = read.nextInt();
    int res = greatestOfTwoNumber(n1,n2);
    res = greatestOfTwoNumber(n3,res);
    System.out.println(res);
  }
  public static int greatestOfTwoNumber(int n1,int n2)
  {
    int result = 1;
    if(n1 > n2)
    {
      result = n1;
    }
    else
    {
      result = n2;
    }
    return result;
  }
}