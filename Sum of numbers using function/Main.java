import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner read = new Scanner(System.in);
      int num = read.nextInt();
      int res = sum(num);
      System.out.println(res);
	}
  public static int sum(int num)
  {
    int sum = 0;
    for(int i = 1; i <= num; i++)
    {
      sum = sum + i;
    }
    return sum;
  }
}