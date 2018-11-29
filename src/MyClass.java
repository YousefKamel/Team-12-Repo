import java.io.*;
import java.util.*;
import java.util.Scanner;
//////////////////////////////////////////////////////////////////////////////////////////
public class MyClass
{
	public MyClass()
	{	
	}
	/////////////////////////////////////////////////
public static int countprimes(int []arr){
        int counter=0;
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0)
                   flag=false; 
                    
            }
            if(flag)
                counter++;
            flag=true;
        }
        return counter;}
	public static boolean CheckSorted(int [] arr)
    	{
        boolean value = true;
        int [] out =new int [arr.length];
        for (int i=0;i<arr.length;i++)
        {
            out[i]=arr[i];
        }
        for (int i=0;i<out.length;i++)
        {
            for (int j=i+1;j<out.length;j++)
            {
                if(out[i]>out[j])
                {
                    int temp = out[i];
                    out[i]=out[j];
                    out[j]=out[i];
                }
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]!=out[i])
            {
                value=false;
                break;
            }
        }
        return value;
    	}
	/////////////////////////////////////////////////
	public static boolean isPrimeNumber(int i)
	{
        int factors = 0;
        int j = 1;
        while(j <= i)
        {
            if(i % j == 0)
            {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }
	//////////////////////////////////////////////////
	public static void ReturnPrime(int A[])
	{
		for (int i=0; i<A.length; i++)
		{
			if( isPrimeNumber(A[i]) == true )
				System.out.println(A[i]);
				
		}
	}
	/////////////////////////////////////////////////
public static void zero_if_less_than_zero(int [] array)
	{
		for (int i=0;i<array.length;i++)
		{
			if (array[i]<0)
			{
				array[i]=0;
			}
		}
		
	}
	////////////////////////////////////////////////////////
	public static void Shuffle(int []arr)
    {
        Random rand = new Random();
        for(int i = 0;i<arr.length;i++)
        {
            int index = rand.nextInt(arr.length);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");

    }
    //////////////////////////////////////////////////
	public static int find_min_prime(int arr[])
    {
        Arrays.sort(arr);
        return arr[0];
    }


	public static void main(String[] args)
	{	

	}
}
