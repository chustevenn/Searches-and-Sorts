public class BinarySearch extends ConsoleProgram
{
    public void run()
    {
        int[] arr = {3, 6, 17, 19, 23, 30, 50};
        
        int index1 = binarySearch(arr, 6);
        System.out.println(index1);
        
        int index2 = binarySearch(arr, 30);
        System.out.println(index2);
        
        int index3 = binarySearch(arr, 3);
        System.out.println(index3);
    }

    public int binarySearch(int[] array, int key)
    {
        int low = 0;
        int high = array.length - 1;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            
            int cur = array[mid];
            
            if(cur == key)
            {
                return mid;
            }
            else if(cur < key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }   
        return -1;
    }
}
