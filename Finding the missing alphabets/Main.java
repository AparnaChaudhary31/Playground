 
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner read = new Scanner(System.in);
    String str = read.nextLine();
    int length = str.length();
    int occurences[] = new int[26];
    for(int index = 0; index < 26; index ++)
    {
      occurences[index] = 0;
    }
    for(int index = 0; index < length; index ++)
    {
      if(str.charAt(index) >= 'a' && str.charAt(index) <= 'z')
      {
        int temp = str.charAt(index) - 'a';
        occurences[temp] ++;
      }
      else if(str.charAt(index) >= 'A' && str.charAt(index) <= 'Z')      
      {
        int temp = str.charAt(index) - 'A';
        occurences[temp] ++;
      }
    }
    for(int i = 0; i < 26; i ++)
    {
      if(occurences[i] == 0)
      {
        char alphabet = (char)('a' + i);
        System.out.print(alphabet + " ");
      }
    }
  }
}
