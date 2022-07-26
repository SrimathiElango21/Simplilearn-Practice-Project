package assPracticeProject;

public class SmallestNumberArray {

	public void sortArr(int arr[])  
	{  
	int size = arr.length;  
	  
	for(int i = 0; i < size; i++)  
	{  
	int temp = i;  
	for(int j = i + 1; j < size; j++)  
	{  
	if(arr[temp] > arr[j])  
	{  
	temp = j;  
	}   
}    
	if(temp != i)  
	{  
	    int t = arr[i];  
	    arr[i] = arr[temp];  
	    arr[temp] = t;   
	}  
	}  
	}   
public int findKthSmallest(int arr[], int k)  
	{  
	sortArr(arr);  
	return arr[k - 1];  
}

	public static void main(String[] args) {
		
		SmallestNumberArray obj = new SmallestNumberArray();  
		  
		  
		int arr1[] = {16,21,5,26,6,31};  
		  
		int size = arr1.length;  
		int k = 4;  
		  
		System.out.println("For the array: ");  
		for(int i = 0; i < size; i++)  
		{  
		System.out.print(arr1[i] + " ");  
		}  
		  
		int ele = obj.findKthSmallest(arr1, k);  
		  
		System.out.println();  
		System.out.println("The " + k + "th smallest element of the array is: " + ele);  

	}

}
