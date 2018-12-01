import java.io.*;
import java.util.*;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////
public class MyClass {
    public MyClass() {
}
	/////////////////////////////////////////////////
	public static boolean isPrimeNumber(int i) {
		int factors = 0;
		int j = 1;
		while (j <= i) {
			if (i % j == 0) {
				factors++;
			}
			j++;
		}
		return (factors == 2);
	}

        //////////////////////////////////////////////////
	public static void ReturnPrime(int A[]) {
		for (int i = 0; i < A.length; i++) {
			if (isPrimeNumber(A[i]) == true)
				System.out.println(A[i]);

		}
	}
        /////////////////////////////////////////////////
	public static double getmedian(int[] arr) {
		Arrays.sort(arr);
		double median = 0;
		if (arr.length % 2 == 0) // even
		{
			int i = arr.length / 2;
			int k = (arr.length / 2) - 1;
			median += arr[k];
			median += arr[i];
			median /= 2;
		} else // odd
		{
			int i = arr.length / 2;
			median += arr[i];
		}
		return median;
	}
	////////////////////////////////////////////////////////////////
	static void SortArray(int[] array) {

		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

    /////////////////////////////////////////////////
	public static int countprimes(int[] arr) {
		int Count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrimeNumber(arr[i]) == true) {
				Count++;
			}
		}
		return Count;
	}

    //////////////////////////////////////////////////
	public static boolean CheckSorted(int[] arr) {
		boolean value = true;
		int[] out = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			out[i] = arr[i];
		}
		for (int i = 0; i < out.length; i++) {
			for (int j = i + 1; j < out.length; j++) {
				if (out[i] > out[j]) {
					int temp = out[i];
					out[i] = out[j];
					out[j] = out[i];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != out[i]) {
				value = false;
				break;
			}
		}
		return value;
	}
	public static void zero_if_less_than_zero(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = 0;
			}
		}
	}

    ////////////////////////////////////////////////////////
	public static void Shuffle(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			int index = rand.nextInt(arr.length);
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

    //////////////////////////////////////////////////
	public static void find_min_prime(ArrayList<Integer> arr) {
		Collections.sort(arr);
		System.out.print(arr.get(0));
		System.out.println(" ");
	}

    /////////////////////////////////////////////////////
	public static void MostRepeatedValue(ArrayList<Integer> arr) {
		HashMap<Integer, Integer> hash = new HashMap<>();
        //////intial hash map with array numbers (unique) /////
		for (int i = 0; i < arr.size(); i++) {
			hash.put(arr.get(i), 0);
		}
		int temp = 0;
        //////////CALCULATE NUMBER OF REPETITION/////////////
		for (Map.Entry m : hash.entrySet()) {
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i) == m.getKey()) {
					temp = (int) m.getValue(); ////// get value inside map
					temp++; ////// increment it
					hash.put((Integer) m.getKey(), temp); /// overwrite it
				}
			}
		}
         /////////GET MOST REPEATED//////////////
		int max = 0; ///// max number of repeatition
		int repeated_most = 0; ////// most repeated value
		for (Map.Entry m : hash.entrySet()) {
			if (max < ((int) m.getValue())) {
				max = (int) m.getValue();
				repeated_most = (int) m.getKey();
			}
		}
		System.out.println(repeated_most);
	}
    ////////////////////////////////////////////////////////
	public static void printDistinctElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isDistinct = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDistinct = true;
					break;
				}
			}
			if (!isDistinct) {
				System.out.print(arr[i] + " ");
			}
		}
	}
    /////////////////////////////////////////////////////
	static public void findLargestPrime(int[] arr) {

		Vector<Integer> v = new Vector<Integer>();
		int largestPrime;

		for (int i = 0; i < arr.length; i++) {
			if (isPrimeNumber(arr[i]) && arr[i] != 0)
				v.add(arr[i]);
		}

		if (v.size() > 0) {
			largestPrime = Collections.max(v);
			System.out.println(largestPrime);
		} else {
			System.out.println("-1");
		}
	}
    ////////////////////////////////////////////////////////////////////////////////////////
	public static void Get_Minimum(ArrayList<Integer> Numbers) {
		int Temp = 0;
		ArrayList<Integer> Mini = new ArrayList<>();
		for (int i = 0; i < Numbers.size(); i++) {
			for (int j = i + 1; j < Numbers.size(); j++) {
				if (Numbers.get(i) > Numbers.get(j)) {
					Temp = Numbers.get(i);
					Numbers.set(i, Numbers.get(j));
					Numbers.set(j, Temp);
				}
				if (j == Numbers.size() - 1 && !(Mini.contains(Numbers.get(i)))) {
					Mini.add(Numbers.get(i));
				}
			}
		}
		System.out.println(Mini.get(0) + " , " + Mini.get(1) + " , " + Mini.get(2));
	}

    ///////////////////////////////////////////////////////////////////////
	public static boolean exist(int[] arr, int j)
	{ // to check if a value already exists in the array before
		for (int i = 0; i < 3; i++)
			if (arr[i] == j)
				return true;
		return false;
	}
	//////////////////////////////////////////////////////////////////////
	public static void GetMax(int[] arr, int size) 
	{
		int[] max = new int[] { 0, 0, 0 };
		int[] ptr = new int[] { -1, -1, -1 }; // used to store position of maximum elements
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < size; j++) 
			{
				if (max[i] < arr[j] && !exist(ptr, j)) 
				{
					max[i] = arr[j];
					ptr[i] = j;
				}
			}
		}
		for(int i=0; i<3; i++)
		{
			System.out.println(max[i]);
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////
	public static void reverseArray(String data) {
		System.out.println(new StringBuilder(data).reverse());
	}
	///////////////////////////////////////////////////////////////
	public static boolean palindrome(String data){
		return data.equals(new StringBuilder(data).reverse().toString());
		}
    ///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true)
		{
		System.out.println("Available Functions: ");
		System.out.println("--------------------");
		System.out.println("1- Count primes.");
		System.out.println("2- Check Sorted.");
		System.out.println("3- Return only primes.");
		System.out.println("4- Zero if less than zero.");
		System.out.println("5- Shuffle.");
		System.out.println("6- Find smallest prime.");
		System.out.println("7- Most repeated value.");
		System.out.println("8- Sort.");
		System.out.println("9- Distnict Array.");
		System.out.println("10- Find Largest Prime.");
		System.out.println("11- Get the minimum 3 numbers.");
		System.out.println("12- Check palindrome.");
		System.out.println("13- Reverse Array.");
		System.out.println("14- Get median.");
		System.out.println("15- Get the maximum 3 numbers.");
		System.out.println("--------------------");
		System.out.println("Please Enter Function Number You Want OR Enter (0) To Execute All Functions.");
		int Choice;
		Choice = input.nextInt();
		if (Choice == 1) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("1- Count primes: " + countprimes(InputArray));
			System.out.println("--------------------");
		} else if (Choice == 2) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			boolean flag2 = CheckSorted(InputArray);
			if (flag2 == true) {
				System.out.println("2- Check Sorted: True.");
			} else if (flag2 == false) {
				System.out.println("2- Check Sorted: False.");
			}
			System.out.println("--------------------");
		} else if (Choice == 3) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("3- Return Prime: ");
			ReturnPrime(InputArray);
			System.out.println("--------------------");
		} else if (Choice == 4) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("4- Zero if less than zero: ");
			zero_if_less_than_zero(InputArray);
			for (int i = 0; i < Size; i++) {
				System.out.print(InputArray[i] + " ");
				System.out.println(" ");
			}
			System.out.println("--------------------");
		} else if (Choice == 5) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("5- Shuffle: ");
			Shuffle(InputArray);
			System.out.println(" ");
			System.out.println("--------------------");
		} else if (Choice == 6) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("6- Find smallest prime: ");
			ArrayList<Integer> A = new ArrayList<>();
			for (int i = 0; i < Size; i++) 
			{
				if (isPrimeNumber(InputArray[i]) == true) 
				{
					A.add(InputArray[i]);
				}
			}
			boolean flag6 = false;
			for (int j = 0; j < Size; j++) 
			{
				if (isPrimeNumber(InputArray[j]) == true)
				{
					flag6 = true;
					break;
				}	
			}
			if(flag6 == true)
			{
				find_min_prime(A);
			}
			else if(flag6 == false)
			{
				System.out.println("-1");
			}
			System.out.println("--------------------");
		} else if (Choice == 7) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("7- Most repeated value: ");
			ArrayList<Integer> li = new ArrayList<>();
			for (int i = 0; i < Size; i++) {
				li.add(InputArray[i]);
			}
			MostRepeatedValue(li);
			System.out.println("--------------------");
		} else if (Choice == 8) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("8- Sort: ");
			SortArray(InputArray);
			System.out.println("--------------------");
		} else if (Choice == 9) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("9- Distnict Array: ");
			printDistinctElements(InputArray);
			System.out.println("--------------------");
		} else if (Choice == 10) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("10- Find Largest Prime: ");
			findLargestPrime(InputArray);
			System.out.println("--------------------");
		} else if (Choice == 11) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			ArrayList<Integer> Data = new ArrayList<>();
			for (int i = 0; i < Size; i++) {
				int Num = input.nextInt();
				Data.add(Num);
			}
			System.out.println("11- Get the minimum 3 numbers: ");
			Get_Minimum(Data);
			System.out.println("--------------------");
		} else if (Choice == 12) {
			System.out.println("Please Enter The String You Want (Numbers/Characters):");
			input.nextLine();
			String InputString = input.nextLine();
			System.out.println("12- Check palindrome: ");
			boolean flag12 = palindrome(InputString);
			if(flag12 == true)
			{
				System.out.println("True");
			}
			else if(flag12 == false)
			{
				System.out.println("False");
			}
			System.out.println("--------------------");
		} else if (Choice == 13) {
			System.out.println("Please Enter The String You Want (Numbers/Characters):");
			input.nextLine();
			String InputString = input.nextLine();
			System.out.println("13- Reverse Array: ");
			reverseArray(InputString);
			System.out.println("--------------------");
		} else if (Choice == 14) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("14- Get median: ");
			double Result = getmedian(InputArray);
			System.out.println(Result);
			System.out.println("--------------------");
		}
		else if (Choice == 15) {
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("15- Get the Maximum 3 Numbers: ");
			GetMax(InputArray, Size);
			System.out.println("--------------------");
		}
		/***********************************************************************************************************/
		else if (Choice == 0)
		{
			////////////////////////////////////////////////////////////////////////////
			System.out.println("1- Count primes");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size;
			Size = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray[] = new int[Size];
			for (int i = 0; i < Size; i++) {
				InputArray[i] = input.nextInt();
			}
			System.out.println("1- Count primes: " + countprimes(InputArray));
			System.out.println("--------------------");
			///////////////////////////////////////////////////////////////////////////////////////
			System.out.println("2- Check Sorted");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size2;
			Size2 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray2[] = new int[Size2];
			for (int i = 0; i < Size2; i++) {
				InputArray2[i] = input.nextInt();
			}
			boolean flag2 = CheckSorted(InputArray2);
			if (flag2 == true) {
				System.out.println("2- Check Sorted: True.");
			} else if (flag2 == false) {
				System.out.println("2- Check Sorted: False.");
			}
			System.out.println("--------------------");
			//////////////////////////////////////////////////////////////////////////////////////
			System.out.println("3- Return Prime: ");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size3;
			Size3 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray3[] = new int[Size3];
			for (int i = 0; i < Size3; i++) {
				InputArray3[i] = input.nextInt();
			}
			System.out.println("3- Return Prime: ");
			ReturnPrime(InputArray3);
			System.out.println("--------------------");
			///////////////////////////////////////////////////////////////////////////////////
			System.out.println("4- Zero if less than zero: ");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size4;
			Size4 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray4[] = new int[Size4];
			for (int i = 0; i < Size4; i++) {
				InputArray4[i] = input.nextInt();
			}
			System.out.println("4- Zero if less than zero: ");
			zero_if_less_than_zero(InputArray4);
			for (int i = 0; i < Size4; i++) {
				System.out.print(InputArray4[i] + " ");
				System.out.println(" ");
			}
			System.out.println("--------------------");
			//////////////////////////////////////////////////////////////////////////////////
			System.out.println("5- Shuffle: ");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size5;
			Size5 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray5[] = new int[Size5];
			for (int i = 0; i < Size5; i++) {
				InputArray5[i] = input.nextInt();
			}
			System.out.println("5- Shuffle: ");
			Shuffle(InputArray5);
			System.out.println(" ");
			System.out.println("--------------------");
			////////////////////////////////////////////////////////////////////////////////
			System.out.println("6- Find smallest prime: ");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size6;
			Size6 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray6[] = new int[Size6];
			for (int i = 0; i < Size6; i++) {
				InputArray6[i] = input.nextInt();
			}
			System.out.println("6- Find smallest prime: ");
			ArrayList<Integer> A = new ArrayList<>();
			for (int i = 0; i < Size6; i++) 
			{
				if (isPrimeNumber(InputArray6[i]) == true) 
				{
					A.add(InputArray6[i]);
				}
			}
			boolean flag6 = false;
			for (int j = 0; j < Size6; j++) 
			{
				if (isPrimeNumber(InputArray6[j]) == true)
				{
					flag6 = true;
					break;
				}	
			}
			if(flag6 == true)
			{
				find_min_prime(A);
			}
			else if(flag6 == false)
			{
				System.out.println("-1");
			}
			System.out.println("--------------------");
			//////////////////////////////////////////////////////////////////////////
			System.out.println("7- Most repeated value: ");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size7;
			Size7 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray7[] = new int[Size7];
			for (int i = 0; i < Size7; i++) {
				InputArray7[i] = input.nextInt();
			}
			System.out.println("7- Most repeated value: ");
			ArrayList<Integer> li = new ArrayList<>();
			for (int i = 0; i < Size7; i++) {
				li.add(InputArray7[i]);
			}
			MostRepeatedValue(li);
			System.out.println("--------------------");
			////////////////////////////////////////////////////////////////////////
			System.out.println("8- Sort: ");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size8;
			Size8 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray8[] = new int[Size8];
			for (int i = 0; i < Size8; i++) {
				InputArray8[i] = input.nextInt();
			}
			System.out.println("8- Sort: ");
			SortArray(InputArray8);
			System.out.println("--------------------");
			/////////////////////////////////////////////////////////////////////////////
			System.out.println("9- Distnict Array: ");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size9;
			Size9 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray9[] = new int[Size9];
			for (int i = 0; i < Size9; i++) {
				InputArray9[i] = input.nextInt();
			}
			System.out.println("9- Distnict Array: ");
			printDistinctElements(InputArray9);
			System.out.println("--------------------");
			////////////////////////////////////////////////////////////////////////////
			System.out.println("10- Find Largest Prime: ");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size10;
			Size10 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray10[] = new int[Size10];
			for (int i = 0; i < Size10; i++) {
				InputArray10[i] = input.nextInt();
			}
			System.out.println("10- Find Largest Prime: ");
			findLargestPrime(InputArray10);
			System.out.println("--------------------");
			///////////////////////////////////////////////////////////////////////////
			System.out.println("11- Get the minimum 3 numbers: ");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size11;
			Size11 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			ArrayList<Integer> Data = new ArrayList<>();
			for (int i = 0; i < Size11; i++) {
				int Num = input.nextInt();
				Data.add(Num);
			}
			System.out.println("11- Get the minimum 3 numbers: ");
			Get_Minimum(Data);
			System.out.println("--------------------");
			///////////////////////////////////////////////////////////////////////
			System.out.println("12- Check palindrome: ");
			System.out.println("Please Enter The String You Want (Numbers/Characters):");
			input.nextLine();
			String InputString = input.nextLine();
			System.out.println("12- Check palindrome: ");
			boolean flag12 = palindrome(InputString);
			if(flag12 == true)
			{
				System.out.println("True");
			}
			else if(flag12 == false)
			{
				System.out.println("False");
			}
			System.out.println("--------------------");
			/////////////////////////////////////////////////////////////////////////
			System.out.println("13- Reverse Array: ");
			System.out.println("Please Enter The String You Want (Numbers/Characters):");
			input.nextLine();
			String InputString13 = input.nextLine();
			System.out.println("13- Reverse Array: ");
			reverseArray(InputString13);
			System.out.println("--------------------");
			///////////////////////////////////////////////////////////////////////////
			System.out.println("14- Get median: ");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size14;
			Size14 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray14[] = new int[Size14];
			for (int i = 0; i < Size14; i++) {
				InputArray14[i] = input.nextInt();
			}
			System.out.println("14- Get median: ");
			double Result = getmedian(InputArray14);
			System.out.println(Result);
			System.out.println("--------------------");
			////////////////////////////////////////////////////////////////////////////
			System.out.println("15- Get the Maximum 3 Numbers: ");
			System.out.println("Please Enter Array Size (Number of Array elements):");
			int Size15 = input.nextInt();
			System.out.println("Please Enter Array Elements (Each element in a new Line):");
			int InputArray15[] = new int[Size15];
			for (int i = 0; i < Size15; i++) 
			{
				InputArray15[i] = input.nextInt();
			}
			System.out.println("15- Get the Maximum 3 Numbers: ");
			GetMax(InputArray15, Size15);
			System.out.println("--------------------");
			////////////////////////////////////////////////////////////////////////////
		}
		}
	}
}
