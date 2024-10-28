import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        solution.Selection_sort(arr);
    }
}

class Solution {
    public void Selection_sort(int[] arr) {
        int n = arr.length;
        for (int i=0;i<n-1 ;i++ )
        {
            int minIndex=i;
           for (int j=i+1;j<n-1 ;j++ )
        {
         if (arr[j]<arr[minIndex])
         {
             minIndex=j;
         }
         
        } 
        int temp=arr[minIndex];
        arr[minIndex]=arr[i];
        arr[i]=temp;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
