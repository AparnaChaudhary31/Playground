import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner read = new Scanner(System.in);
      int noofrow = read.nextInt();
      for(int currrow = 1; currrow <= noofrow; currrow ++ )
      {
        for(int currcol = 1; currcol <= currrow; currcol ++)
        {
          System.out.print(currrow);
        }
        System.out.println();
      }
	}
}