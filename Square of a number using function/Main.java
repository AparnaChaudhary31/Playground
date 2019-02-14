import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner read = new Scanner(System.in);
      int num = read.nextInt();
      int square = findsquare(num);
      System.out.println(square);
	} 
  public static int findsquare(int num)
  {
    int square = num * num;
    return square;
  }
}