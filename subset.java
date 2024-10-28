import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long [] a1=new long[n];
		int m=sc.nextInt();
		long [] a2=new long[m];
		for(int i=0;i<n;i++)
		{
		    a1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    a2[i]=sc.nextInt();
		}
		Solution solution=new Solution();
		boolean  isSubset=solution. isSubset(a1,a2,n,m);
		if(isSubset)
		{
		    System.out.print("YES");
		}
		else
		{
		    System.out.print("NO");
		}
	}
}
class Solution
{
    public boolean isSubset(long [] a1, long [] a2, long n,long m)
    {
        Set<Long> set = new HashSet<>();
        
        // Add all elements of a1 to the set
        for (int i = 0; i < n; i++) {
            set.add(a1[i]);
        }
        
        // Check if all elements of a2 are present in the set
        for (int i = 0; i < m; i++) {
            if (!set.contains(a2[i])) {
                return false;
            }
            else
            {
                return true;
            }
        }
        
        return true;
    }
}
