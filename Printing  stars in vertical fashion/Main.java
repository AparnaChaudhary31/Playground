import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here\
    Scanner read=new Scanner(System.in);
    int n = read.nextInt();
    int starcount;
    for(starcount = 1; starcount <= n; starcount++)
    {
      System.out.println("*");
    }
  }
}