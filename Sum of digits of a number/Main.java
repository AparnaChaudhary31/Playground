import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner read = new Scanner(System.in);
      int num = read.nextInt();
	  int digit_count = 0;
      int n = num;
      while(n > 0)
      {
         n = n / 10;
         digit_count = digit_count + 1;
      }
      int sum = 0;
      int temp;
      while(digit_count != 0)
      {
        temp = num % 10;
        num = num/10;
        sum = sum + temp;
        digit_count = digit_count - 1;
      }
     System.out.println(sum);
	}
}