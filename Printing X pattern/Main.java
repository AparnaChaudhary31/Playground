import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner read = new Scanner(System.in);
  int noofrow = read.nextInt();
  for(int currrow = 1; currrow <= noofrow; currrow ++)
  {
    for(int currcol = 1; currcol <= noofrow; currcol ++)
    {
     if(currrow == currcol || currrow + currcol == noofrow + 1) 
     {
       System.out.print("*");
     }
      else
      {
        System.out.print(" ");
      }
	}
     System.out.println();
 }
}
}
