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
	static void SortArray() {
        	Scanner scan = new Scanner(System.in);
        	System.out.append("Enter number of elements in array :");
        	int n = scan.nextInt();
        	int[] array = new int[n];
        	for (int i = 0; i < n; i++) {
           	      array[i] = scan.nextInt();
        	}
       		 Arrays.sort(array);
       		 System.out.println("Number after Sorting...");
       		 for (int i = 0; i < n; i++) {
          	      System.out.print(array[i] + " ");
       		 }
        	System.out.println();
    	}
	/////////////////////////////////////////////////
        public static int countprimes(int [] arr)
        {
        int Count=0;
        for(int i=0; i<arr.length; i++)
        {
        	if(isPrimeNumber(arr[i]) == true)
        	{
        		Count++;
        	}
        }
        return Count;
        }
        //////////////////////////////////////////////////
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
        public static void find_min_prime(ArrayList <Integer> arr)
        {
		Collections.sort(arr);
		System.out.print(arr.get(0));
		System.out.println(" ");
        }
        /////////////////////////////////////////////////////
	public static int MostRepeatedValue(ArrayList <Integer> arr)
	{
	       HashMap <Integer,Integer> hash=new HashMap<>();
	       //////intial hash map with array numbers (unique) /////
	        for(int i=0;i<arr.size();i++){ 
	            hash.put(arr.get(i),0);
	        }
	        int temp=0;
	        //////////CALCULATE NUMBER OF REPETITION/////////////
	        for(Map.Entry m:hash.entrySet()){  
	            for(int i=0;i<arr.size();i++){
	                if(arr.get(i)==m.getKey()){
	                    temp=(int) m.getValue(); //////get value inside map
	                    temp++; //////increment it 
	                    hash.put((Integer) m.getKey(),temp); ///overwrite it
	                }
	            }
	        }
	        /////////GET MOST REPEATED//////////////
	        int max=0; /////max number of repeatition
	        int repeated_most=0; ////// most repeated value 
	      for(Map.Entry m:hash.entrySet()){ 
	          if(max < ((int) m.getValue())){
	              max=(int) m.getValue();
	              repeated_most=(int) m.getKey();
	          } 
	          }
	     return(repeated_most);
	    }
	////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.println("Available Functions: ");
		System.out.println("--------------------");
		System.out.println("1- Count primes.");
		System.out.println("2- Check Sorted.");
		System.out.println("3- Return only primes.");
		System.out.println("4- Zero if less than zero.");
		System.out.println("5- Shuffle.");
		System.out.println("6- Find smallest prime.");
		System.out.println("7- Most repeated value.");
		System.out.println("8- Sort an Array.");
		System.out.println("--------------------");
		System.out.println("Please Enter Function Number You Want OR Enter (0) To Execute All Functions.");
		int Choice;
		Choice = input.nextInt();
		System.out.println("Please Enter Array Size (Number of Array elements):");
		int Size;
		Size = input.nextInt();
		System.out.println("Please Enter Array Elements (Each element in a new Line):");
		if(Choice == 1)
		{
			int InputArray[]= new int [Size];
			for(int i=0; i<Size; i++)
			{
				InputArray[i] = input.nextInt();
			}
			System.out.println("1- Count primes: "+countprimes(InputArray));
			System.out.println("--------------------");
		}
		else if(Choice == 2)
		{
			int InputArray[]= new int [Size];
			for(int i=0; i<Size; i++)
			{
				InputArray[i] = input.nextInt();
			}
			boolean flag2 = CheckSorted(InputArray);
			if(flag2 == true)
			{
				System.out.println("2- Check Sorted: True.");
			}
			else if(flag2 == false)
			{
				System.out.println("2- Check Sorted: False.");
			}
			System.out.println("--------------------");
		}
		else if(Choice == 3)
		{
			int InputArray[]= new int [Size];
			for(int i=0; i<Size; i++)
			{
				InputArray[i] = input.nextInt();
			}
			System.out.println("3- Return Prime: ");
			ReturnPrime(InputArray);
			System.out.println("--------------------");
		}
		else if(Choice == 4)
		{
			int InputArray[]= new int [Size];
			for(int i=0; i<Size; i++)
			{
				InputArray[i] = input.nextInt();
			}
			System.out.println("4- Zero if less than zero: ");
			zero_if_less_than_zero(InputArray);
			for(int i=0; i<Size; i++)
			{
				System.out.print(InputArray[i] + " ");
			}
			System.out.println("--------------------");
		}
		else if(Choice == 5)
		{
			int InputArray[]= new int [Size];
			for(int i=0; i<Size; i++)
			{
				InputArray[i] = input.nextInt();
			}
			System.out.println("5- Shuffle: ");
			Shuffle(InputArray);
			System.out.println("--------------------");
		}
		else if(Choice == 6)
		{
			int InputArray[]= new int [Size];
			for(int i=0; i<Size; i++)
			{
				InputArray[i] = input.nextInt();
			}
			System.out.println("6- Find smallest prime: ");
			ArrayList<Integer> A = new ArrayList <> ();
			for(int i=0; i<Size; i++)
			{
				if(isPrimeNumber(InputArray[i]) == true)
				{
					A.add(InputArray[i]);
				}
			}
			find_min_prime(A);
			System.out.println("--------------------");
		}
		else if(Choice == 7)
		{
			int InputArray[]= new int [Size];
			for(int i=0; i<Size; i++)
			{
				InputArray[i] = input.nextInt();
			}
			System.out.println("7- Most repeated value: ");
			ArrayList<Integer> li = new ArrayList <> ();
			for(int i=0; i<Size; i++)
			{
				li.add(input.nextInt());
			}
			System.out.println("7- Most repeated value: "+MostRepeatedValue(li));
			System.out.println("--------------------");
		}
		else if (Choice == 8){
			SortArray();
		}
		else if(Choice == 0)
		{
			int InputArray[]= new int [Size];
			for(int i=0; i<Size; i++)
			{
				InputArray[i] = input.nextInt();
			}
			//////////////////////////////////////
			System.out.println("1- Count primes: "+countprimes(InputArray));
			System.out.println("--------------------");
			/////////////////////////////////////////
			boolean flag2 = CheckSorted(InputArray);
			if(flag2 == true)
			{
				System.out.println("2- Check Sorted: True.");
			}
			else if(flag2 == false)
			{
				System.out.println("2- Check Sorted: False.");
			}
			System.out.println("--------------------");
			///////////////////////////////////////////
			System.out.println("3- Return Prime: ");
			ReturnPrime(InputArray);
			System.out.println("--------------------");
			///////////////////////////////////////////
			System.out.println("4- Zero if less than zero: ");
			zero_if_less_than_zero(InputArray);
			for(int i=0; i<Size; i++)
			{
				System.out.print(InputArray[i] + " ");
				System.out.println(" ");
			}
			System.out.println("--------------------");
			////////////////////////////////////////////
			System.out.println("5- Shuffle: ");
			Shuffle(InputArray);
			System.out.println(" ");
			System.out.println("--------------------");
			////////////////////////////////////////////
			System.out.println("6- Find smallest prime: ");
			ArrayList<Integer> A = new ArrayList <> ();
			for(int i=0; i<Size; i++)
			{
				if(isPrimeNumber(InputArray[i]) == true)
				{
					A.add(InputArray[i]);
				}
			}
			find_min_prime(A);
			System.out.println("--------------------");
			//////////////////////////////////////////////
			ArrayList<Integer> li = new ArrayList <> ();
			for(int i=0; i<Size; i++)
			{
				li.add(InputArray[i]);
			}
			System.out.println("7- Most repeated value: "+MostRepeatedValue(li));
			System.out.println("--------------------");
			///////////////////////////////////////////////
		}
	}
}

