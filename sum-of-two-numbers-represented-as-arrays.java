import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> findSum(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = a.length - 1;
        int j = b.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) 
        {
            int sum = carry;
            
            if (i >= 0) {
                sum += a[i];
                i--;
            }
            
            if (j >= 0) {
                sum += b[j];
                j--;
            }
            
            result.add(sum % 10);
            carry = sum / 10;
            System.out.print(carry+"  __"+result);
        }

        // Reverse the result list to get the correct order
        ArrayList<Integer> finalResult = new ArrayList<>();
        for (int k = result.size() - 1; k >= 0; k--) {
            finalResult.add(result.get(k));
        }

        return finalResult;
       
    }

    public static void main(String[] args) 
    {
        int a[] = {5, 6, 3};
        int b[] = {8, 4, 2};
        int N = 3, M = 3;
        ArrayList<Integer> result = findSum(a, b);
        System.out.println(result);  // Output: [1, 4, 0, 5]

        int a1[] = {2, 2, 7, 5, 3, 3};
        int b2[] = {4, 3, 3, 8};
        int N2 = 6, M2 = 4;
        ArrayList<Integer> result2 = findSum(a1, b2);
        System.out.println(result2);  // Output: [2, 3, 1, 8, 7, 1]
    }
}
