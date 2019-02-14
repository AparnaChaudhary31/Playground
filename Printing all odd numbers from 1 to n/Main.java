import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner read = new Scanner(System.in);
      int n = read.nextInt();
      for(int i = 1; i <= n; i = i+1)
      {
        if(i % 2 == 1)
        {
          System.out.println(i);
        }
      }
	}
}