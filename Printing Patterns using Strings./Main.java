import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        int len = str.length();
        int mid = len/2;
        for(int index = len-1; index >= 0 ; index --)
        {
            int count = 0;
            for(int i = 0; i < index; i ++)
            {
            System.out.print(" ");
            count++;
            }
            if( index >= len / 2 )
            {
                int j = len/2; 
                while(count < len)
                {
                    System.out.print(str.charAt( j ++ ));
                    count ++;
                }
            }
            else
            {
                int j = len/2;
                while( count <= (len / 2 + index))
                {
                    System.out.print(str.charAt(j++));
                    count++;
                }
                j = 0;
                while(count < len)
                {
                    System.out.print(str.charAt (j ++) );
                    count ++;
                }
            }
            System.out.println();
        }
    }
}
 

  
