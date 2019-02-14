import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
     Scanner read = new Scanner(System.in);
     int num = read.nextInt();
     int result = 0;
     int number = 1;
      int i = 0;
      int temp = num;
     while( num != 0)
     {
        i =  num % 10;
        for(int j = 1; j <= i; j++ )
        {
       	number = number * j;
        }
       result = result + number;
		number = 1;
       num = num/10;
     }
      if(result == temp)
      {
		System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}