import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String A=sc.nextLine();
	String B=sc.nextLine();
	Solution solution=new Solution();
	boolean isSubSequence=solution.isSubSequence(A,B);
	if(isSubSequence)
	{
	System.out.print("1");
	}
	else 
	{
	    System.out.print("0");
	}
	}
}
class Solution
{
    boolean isSubSequence(String A, String B){
        int m=A.length();
        int n=B.length();
        int i=0;
        int j=0;
        while (i<m && j<n)
        {
        if(A.charAt(i)==B.charAt(j))
        {
            i++;
        }
        j++;
        }
        return i==m;
    }
}
