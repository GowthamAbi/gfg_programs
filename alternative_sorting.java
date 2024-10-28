import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		long[] arr = {1, 2, 3, 5, 4, 7, 10};
        int N = arr.length;
        Solution solution=new Solution();
        ArrayList<Long>sortedArr=solution.alternateSort(arr,N);
        for (long num : sortedArr) {
            System.out.print(num + " ");
        }
	}
}
class Solution
{
    public static ArrayList<Long> alternateSort(long arr[] ,int N)
    {
         ArrayList<Long> alternateSort = new ArrayList<>();
        Arrays.sort(arr); // Sort the primitive array
        
        int mid = N / 2;
        int start = 0;
        int end = N - 1;
        
        // Add elements from the end and start alternately
        
        while (start <= mid && end >= mid) {
       
            alternateSort.add(arr[end--]);
            
            if (start < mid) {
                alternateSort.add(arr[start++]);
            }
        }
        
        return alternateSort;
    }
}
