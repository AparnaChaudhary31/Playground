import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner read=new Scanner(System.in);
    int noofrow = read.nextInt();
    int num = noofrow;
    for(int currrow = 1; currrow <= noofrow; currrow ++)
    {
	  for(int currcol = num; currcol >= 1; currcol--)
      {
        System.out.print(currcol);
      }
      System.out.println();
      num--;
    } 
  }
}

