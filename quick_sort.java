import java.util.*;
public class Main;
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [] Quick_sort=new int[n];
	for(int i=0;i<n;i++)
	{
	    Quick_sort[i]=sc.nextInt();
	}
	Solution solution=new Solution();
	int low=0;
	int high=Quick_sort.length-1;
	int [] sort=solution.sort(Quick_sort,low,high);
	for(int i=0;i<n;i++)
	{
	    System.out.print(sort[i]+",");
	}
	}
	
}
class Solution
{
    public class int [] sort(int [] Quick_sort,int low,int high)
    {
       
       int pi=partition(Quick_sort,i,j);
       sort(Quick_sort,pi+1,high);
       sort(Quick_sort,low,pi-1);
    }
    public class int partition(int [] Quick_sort,L,R)
    {
        int pivot=Quick_sort[0];
        int i=1;
        int j=Quick_sort.length-1;
        
        while(i<R && Quick_sort[i]<pivot)
        {
            i++;
        }
        while(j>L && Quick_sort[j]<pivot)
        {
            j--;
        }
        if(i<j && i<=R)
        {
            int temp=Quick_sort[L];
            Quick_sort[L]=Quick_sort[j];
            Quick_sort[j]=temp;
        }
        return i,j;
    }
}