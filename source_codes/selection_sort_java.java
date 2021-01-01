class selection_sort_java
{
	public static void main(String args[])
	{

	int arr[] = {15, 75, 6, 0 ,64, 21, 100};

	System.out.println("Array before sort:");

	printArray(arr);

	System.out.println("Sorted array:");

	printArray(arr);

	}

	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			{ 
				System.out.print(arr[i] + " ");}
	}

}
