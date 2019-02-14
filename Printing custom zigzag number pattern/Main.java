import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner read = new Scanner(System.in);
  int noofrow = read.nextInt();
  int num = 1;
  for(int currrow = 1; currrow <= noofrow; currrow ++)
  {
    for(int currcol = 1; currcol <= noofrow; currcol ++)
    {
     if(num % 2 == 1)
     {
       if(currcol == noofrow)
         System.out.print(num + 1);
       else
         System.out.print(num);
     }
     else
      {
        if(currcol == 1)
         System.out.print(num + 1);
       else
         System.out.print(num);
      }
	}
    num ++;
     System.out.println();
 }
}
}