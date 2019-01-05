import java.util.Arrays;

public class SelectionSort extends ConsoleProgram
{
    public void run()
    {
        int[] arr = {5, 3, 4, 1, 6, 2};
        System.out.println("Before:");
        System.out.println(Arrays.toString(arr));
        
        selectionSort(arr);

        System.out.println("After:");
        System.out.println(Arrays.toString(arr));
        
        int[] arr2 = {6, 3, 2, 10, 15, 8, 1, 90, 7};

        System.out.println("===========");

        System.out.println("Before:");
        System.out.println(Arrays.toString(arr2));
        
        selectionSort(arr2);

        System.out.println("After:");
        System.out.println(Arrays.toString(arr2));  
    }
    
    private void selectionSort(int[] arr)
    {
        for(int curIndex = 0; curIndex < arr.length - 1; curIndex++)
        {
            System.out.println(Arrays.toString(arr));
            int minIndex = findMin(arr, curIndex);
            swap(arr, curIndex, minIndex);
        }
    }
    
    private int findMin(int[] arr, int startingIndex)
    {
        int minIndex = startingIndex;
        
        for(int i = minIndex; i < arr.length; i++)
        {
            if(arr[i] < arr[minIndex])
            {
                minIndex = i;
            }
        }
        
        return minIndex;
    }

    private void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    private int[] selectionSort2(int[] arr)
    {
        int currentMinIndex;
        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.println(Arrays.toString(arr));

            currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[currentMinIndex])
                {
                    currentMinIndex = j;
                }
            }
         
            if (i != currentMinIndex)
            {
                int temp = arr[currentMinIndex];
                arr[currentMinIndex] = arr[i];
                arr[i] = temp;
            }
        }
        
        return arr;
    }
}
