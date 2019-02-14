import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
    Scanner read = new Scanner(System.in);
  int n = read.nextInt();
  int count=1;

  for(int starcount = 1; starcount <= n; starcount++)
  {
    if(count % 4 == 0)
    {
      System.out.print(",");
      count++;
      starcount--;
    }
    else
    {
      System.out.print(starcount);
      count++;
    }
  }
  
}
}