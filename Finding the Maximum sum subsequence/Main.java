import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int arr[] = new int[20];
        int j;
        for(int i = 0; i < N; i ++)
        {
            arr[i] = read.nextInt();
        }
        int running_sum, max_sum_sub;
	    running_sum = arr[0];
  	    max_sum_sub = arr[0];
  	    for(int i = 1; i < N; i++)
        {
            if(arr[i] > arr[i-1])
            {
                running_sum += arr[i];
            }
            else 
            {
                running_sum = arr[i];
            }
            if(running_sum > max_sum_sub)
            {
                max_sum_sub = running_sum;
            }
        }
        System.out.println(max_sum_sub);
    }
}
