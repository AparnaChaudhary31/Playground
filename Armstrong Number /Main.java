import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner read = new Scanner(System.in);
      int num = read.nextInt();
      int res = 0;
      int n = num;
      int temp = num;
	  int a = 0;

      /*      int digit_count = 0;
      while(n > 0)
      {
         n = n / 10;
         digit_count = digit_count + 1;
      }
      int common_dc = digit_count;
      while(num > 0)
      {
         a = num % 10;
         num = num / 10;
        digit_count = common_dc;
         while(digit_count != 0)
         {
           a = a * a;
           digit_count = digit_count - 1;
           System.out.println(a);
          }
         res = res + a;
         
      }*/
	   while(n != 0)
       {
         a = n % 10;
         res = res + a * a * a;
         n = n/10;
       }
       if(temp == res)
        {
          System.out.println("Armstrong Number");
        }
        else
        {
          System.out.println("Not a Armstrong Number");
        }
      
	}
}

	
