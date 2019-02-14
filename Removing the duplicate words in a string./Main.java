import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner read = new Scanner(System.in);
    String str = read.nextLine();
    StringBuilder sb = new StringBuilder(str);
    String word[] = str.split(" ");
    int len = word.length;
    for(int idx1 = 0; idx1 < len; idx1 ++)
    {
      if(word[idx1] != null)
      {
        for(int idx2 = idx1 + 1; idx2 < len; idx2 ++)
        {
          if(word[idx1].equals(word[idx2]))
          {
            word[idx2] = null;
          }
        }
      }
    }
    for(int k = 0; k < len; k ++)
      {
      if(word[k] != null)
      {
        System.out.print(word[k] + " ");
      }
      }

  }
}