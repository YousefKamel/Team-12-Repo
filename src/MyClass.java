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
	public static void main(String[] args)
	{	

	}
}
