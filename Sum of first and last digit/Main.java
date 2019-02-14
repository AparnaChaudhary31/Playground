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
      int first_digit = 0;
      int last_digit = 0;
      last_digit = num % 10;
      digit_count = digit_count - 1;
      while( digit_count != 0)
      {
        num = num/10;
        digit_count = digit_count - 1;
      }
      first_digit = num;
      int result = first_digit + last_digit;
      System.out.println(result);
	}
}