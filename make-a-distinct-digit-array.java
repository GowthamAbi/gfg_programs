import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [] num=new int[n];
	for (int i=0;i<n ;i++ )
	{
	    num[i]=sc.nextInt();
	}
	Solution solution=new Solution();
	int[] commonDigits = solution.common_digits(num);
	for (int digit : commonDigits) {
            System.out.print(digit + " ");
        }
	}
}
class Solution
{
    public static int[] common_digits(int[] num)
    {
     Set<Integer> common=new HashSet<>();
     for(int nums:num)
     {
         String str=String.valueOf(nums);
     
     for(char ch:str.toCharArray())   
     {
         common.add(Character.getNumericValue(ch));
     }
     }
     List<Integer>result=new ArrayList<>(common);
     Collections.sort(result);
     int[] resultArray=new int[result.size()];
     for(int i=0;i<result.size();i++)
     {
         resultArray[i]=result.get(i);
     }
     return resultArray;
    }
}
