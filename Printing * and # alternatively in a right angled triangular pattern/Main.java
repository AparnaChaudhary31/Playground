import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  Scanner read = new Scanner(System.in);
  int noofrow = read.nextInt();
  int num = 0;
  for(int currrow = 1; currrow <= noofrow; currrow ++)
  {
    for(int currcol = 1; currcol <= currrow; currcol ++)
  {
      num = num + 1;
    if(num % 2 == 1)
    System.out.print("*");
    else
    System.out.print("#");
  }
    System.out.println();
  }
  		// Type your code here
    }
}