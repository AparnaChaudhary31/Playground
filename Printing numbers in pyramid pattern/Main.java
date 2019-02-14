import java.util.*;
class Main
{
public static void main(String args[])
{
  Scanner read = new Scanner(System.in);
  int noofrow = read.nextInt();
  int number = 1;
  for(int currrow = 1; currrow <= noofrow; currrow ++)
  {
	for(int space = 1 ; space <= (noofrow - currrow) ; space ++)
	{
  	System.out.print(" ");
	}
	for(int star = 1; star <= currrow; star ++)
	{

  	System.out.print(number + " ");
            number = number + 1;
	}
  	System.out.println();
  }
}
}