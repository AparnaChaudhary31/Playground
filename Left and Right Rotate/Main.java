import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner read = new Scanner(System.in);
  	int size = read.nextInt();
  	int arr[] = new int[size];
    int counteven = 0;
    int countodd = 0;

  	for(int index = 0; index < size; index ++)
  	{
      arr[index] = read.nextInt();
      if(arr[index] % 2 == 0)
      {
          		counteven ++;
      }
    	else
    		{
          		countodd ++;
    		}
    }
    
    int rotation = read.nextInt();
    int even[] = new int[counteven];
    int odd[] = new int[countodd];
    int codd = 0;
    int ceven = 0;
      for(int i = 0; i < size; i ++)
  		{
      	if(arr[i] % 2 == 0)
    		{
        		even[ceven] = arr[i];
          		ceven ++;
    		}
    	else
    		{
          		odd[codd] = arr[i];
          		codd ++;
    		}
      }
     while(rotation != 0)
    {
        int temp = even[0];
        for(int j = 0; j < counteven; j ++)
        {
		  if(j < counteven - 1)
    	  {
        	even[j] = even[j + 1];
    	  }
    	  else
    	  {
            even[counteven - 1] = temp;
    	  }
       }
       int temp2 = odd[0];
       odd[0] = odd[countodd - 1]; 

       for(int j = countodd - 1; j >= 0 ; j --)
        {
         if(j == 0)
         {
           odd[1] = temp2;
         }
         else
         {
           odd[j] = odd[j - 1];
         }
        }
       
       rotation --;
     }
    		
  	/*
 	for(int index = 0; index < counteven; index ++)
  	{
    	System.out.print(even[index] + " ");   
	}
    System.out.println();
    for(int index = 0; index < countodd; index ++)
  	{
    	System.out.print(odd[index] + " ");   
	} 
     System.out.println();
	*/
    int ctodd = 0;
    int cteven = 0;
    
    for(int index = 0; index < size; index ++)
  	{
      if(index % 2 == 0)
      {
        arr[index] = odd[ctodd];
        ctodd ++;
      }
      else
      {
        arr[index] = even[cteven];
        cteven ++;
      }
    	System.out.print(arr[index] + " ");   
	} 
  }
}
