import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    int i, fact = 1; 
    Scanner read = new Scanner(System.in);
    int number = read.nextInt();
    for(i = 1; i <= number; i ++)
    {    
      fact = fact * i;    
  	}    
  System.out.println(fact);    
  }
}