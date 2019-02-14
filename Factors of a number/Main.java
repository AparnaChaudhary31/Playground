import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner read = new Scanner(System.in);
      int num = read.nextInt();
      for(int i = 1; i <= num; i++)
      {
        if(num % i == 0)
        {
          System.out.println(i);
        }
      }
	}
}