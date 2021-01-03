class insertion_sort_java
{
	public static void main(String args[])
	{

	int arr[] = {15, 75, 6, 0 ,64, 21, 100};

	System.out.println("Array before sort:");

	printArray(arr);

	System.out.println("\nSorted array:");

	sort(arr);

	printArray(arr);

	}

	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			{ 
				System.out.print(arr[i] + " ");}
	}

	static void sort(int arr[]) 
    { 
        for (int i = 1; i < arr.length; ++i) 
        { 
            int temp = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > temp) { 

                arr[j + 1] = arr[j]; 
                j = j - 1; 
         	} 

            arr[j + 1] = temp; 
        } 
    } 

}
