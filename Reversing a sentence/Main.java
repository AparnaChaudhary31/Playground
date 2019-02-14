 
import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner read = new Scanner(System.in);
      String str = read.nextLine();
      String word[] = str.split(" ");
      for(int i = word.length - 1; i >= 0; i --)
      {
        System.out.print(word[i] + " ");
      }
    }
}
