import java .util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		 Solution solution =new  Solution();
		 System.out.print(solution.mergeAlternately(str1,str2));
	}
}
class Solution{
    public String mergeAlternately(String word1,String word2)
    {
        
        StringBuilder result=new StringBuilder();
       int len1=word1.length();
       int len2=word2.length();
       int minlength=Math.min(len1,len2);
       for (int i=0;i<minlength ;i++ )
       {
           result.append (word1.charAt(i));
           result.append (word2.charAt(i));
       }
       if(len1>minlength)
       {
           result.append(word1.substring(minlength));
       }
        else
        {
            result.append(word2.substring(minlength));
        }
        return result.toString();
    }
}
