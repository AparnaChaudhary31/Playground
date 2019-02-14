import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
     Scanner read = new Scanner(System.in);
     int num = read.nextInt();
      int result = 1;
     for(int i = 1; i <= num; i++)
     {
       result = result * i;
     }
      System.out.println(result);
	}
}