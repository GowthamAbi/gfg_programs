import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String string1=sc.nextLine();
	String string2=sc.nextLine();
	Solution solution=new Solution();
	System.out.print(solution.removeChars(string1,string2)); 
	
	}
}

class Solution
{
    public static String removeChars(String string1, String string2)
    {
        Set<Character>remove=new HashSet<>();
        for(char c:string2.toCharArray())
        {
            remove.add(c);
        }
        StringBuilder result=new StringBuilder();
        for(char c:string1.toCharArray())
        {
            if(!remove.contains(c))
            result.append(c);
        }
        return result.toString();

    }
}
