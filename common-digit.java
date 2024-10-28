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
     Set<Integer> first=new HashSet<>();
     Set<Integer> remain=new HashSet<>();
     for(char ch:String.valueOf(num[0]).toCharArray())
     {
         first.add(Character.getNumericValue(ch));
     }
     common.addAll(first);
     for(int i=1;i<num.length;i++)
     {
         for(char ch:String.valueOf(num[i]).toCharArray())
     {
         remain.add(Character.getNumericValue(ch));
     }
     common.retainAll(remain);
     
     }
     int[] result=new int[common.size()];
     int index=0;
     for(int digit:common)
     {
         result[index++]=digit;
     }
     return result;
    }
}
