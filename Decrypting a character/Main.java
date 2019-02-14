import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner read = new Scanner(System.in);
      char ch = read.next().charAt(0);
      int key = read.nextInt();
      if(ch >= 'a' && ch <= 'z')
      {
        ch = (char)(ch - key);
        if(ch < 'a')
        {
          ch = (char)(ch + 26);
        }
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
        ch = (char)(ch - key);
        if(ch < 'A')
        {
          ch = (char)(ch + 26);
        }
      }
      System.out.println(ch);
    }
}