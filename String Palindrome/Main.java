import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner read = new Scanner(System.in);
    // Get the input string
    String str = read.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
    // Create another string temp
    StringBuilder temp = new StringBuilder("");
    for(int idx = (str_len - 1); idx >= 0; idx--)
    {
      char ch = sb.charAt(idx);
      temp.append(ch);
    }
    for(int idx = 0; idx < str_len; idx++)
    {
      sb.setCharAt(idx, temp.charAt(idx));
    }
    String strcpy = new String(sb);
    if(str.equals(strcpy) == true)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}
