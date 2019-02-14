import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner read = new Scanner(System.in);
      int n = read.nextInt();
      int sum = 0;
      for(int i = 1; i <= n; i = i+1)
      {
       sum = sum + i;
      }
      System.out.println(sum);
	}
}