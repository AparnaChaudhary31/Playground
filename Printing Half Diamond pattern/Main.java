import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner read=new Scanner(System.in);
    int noofrow = read.nextInt();
    for(int currrow = 1; currrow <= noofrow; currrow ++)
    {
      for(int space = 1 ; space <= (noofrow - currrow) ; space ++)
	  {
        System.out.print(" ");
      }
      for(int star = 1; star <= (currrow * 2) - 1; star ++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}