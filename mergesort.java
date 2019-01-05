import java.util.Arrays;

public class MergeSort extends ConsoleProgram
{
    public void run()
    {
        int[] array1 = {5, 3, 4, 1, 6, 2};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};
        
        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.println();

        mergeSort(array1);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
    }
    
    public void mergeSort(int[] arr) 
    {
        int[] temp = new int[arr.length];
        mergeSortHelper(arr, 0, arr.length - 1, temp);
    }
    
    private void mergeSortHelper(int[] arr, int from, int to, int[] temp)
    {
        if(to - from >= 1)
        {
            int mid = (from + to) / 2;
            mergeSortHelper(arr, from, mid, temp);
            mergeSortHelper(arr, mid + 1, to, temp);
            merge(arr, from, mid, to, temp);
            System.out.println(Arrays.toString(arr));
        }
    }
    
    private void merge(int[] arr, int from, int mid, int to, int[] temp) 
    {
        int i = from;       
        int j = mid + 1;   
        int k = from;      
        
        while(i <= mid && j <= to)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        
        while(j <= to)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(k = from; k <= to; k++)
        {
            arr[k] = temp[k];
        }

    }
}
