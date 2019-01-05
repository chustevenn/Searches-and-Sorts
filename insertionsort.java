import java.util.Arrays;

public class InsertionSort extends ConsoleProgram
{
    public void run()
    {
        int[] array1 = {5, 3, 4, 1, 6, 2};      
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};
        
        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        insertionSort(array1);
        insertionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }
    
    private void insertionSort(int[] arr)
    {
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++)
        {
            int curNumber = arr[i];
            int curIndex = i-1;
            
            while ( curIndex >= 0 && arr[curIndex] > curNumber)
            {
                arr[curIndex+1] = arr[curIndex];
                curIndex--;
            }
            
            arr[curIndex + 1] = curNumber;
            System.out.println(Arrays.toString(arr));
        }
    }
}
