import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	Solution solution=new Solution();
	int romanToInt=solution.romanToInt(s);
	System.out.print(romanToInt);
	
	}
}

class Solution
{
    public static int romanToInt(String s)
    {
        Map<Character,Integer>romanMap=new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result=0;
        int n=s.length();
        for (int i=0;i<n;i++ )
        {
            int currentValue=romanMap.get(s.charAt(i));
            if(i<n-1 && currentValue<romanMap.get(s.charAt(i+1)))
            {
                 result-=currentValue;
            }
            else
            {
                result+=currentValue;
            }
        }
        return result;
    }
}
