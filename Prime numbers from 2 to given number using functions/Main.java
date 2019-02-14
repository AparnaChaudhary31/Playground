import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner read = new Scanner(System.in);
      int num = read.nextInt();
      for(int i = 2; i <= num; i++)
      {
         boolean res = checkPrimeNumber(i);
        if(res == true)
        {
          System.out.println(i);
        }
      }
	}
  public static boolean checkPrimeNumber(int num) 
  {
        boolean flag = true;
		for(int i = 2; i <= num/2; ++i) 
        {
			if(num % i == 0) 
            {
                flag = false;
                break;
            }
        }
		return flag;
    }

}