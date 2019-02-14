import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner read = new Scanner(System.in);
    String str = read.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder res = new StringBuilder("");
    int len = sb.length();
    for(int idx = 0; idx < len; idx ++)
    {
      if(sb.charAt(idx) == 'a' || sb.charAt(idx) == 'e' || sb.charAt(idx) == 'i' || sb.charAt(idx) == 'o' || sb.charAt(idx) == 'u'
        || sb.charAt(idx) == 'A' || sb.charAt(idx) == 'E' || sb.charAt(idx) == 'I' || sb.charAt(idx) == 'O' || sb.charAt(idx) == 'U')
      {
        continue;
      }
      else
      {
        char ch = sb.charAt(idx);
        res.append(ch);
      }
    }
    System.out.println(res);
  }
}