import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [] Insertion_sort=new int[n];
	for(int i=0;i<n;i++)
	{
	    Insertion_sort[i]=sc.nextInt();
	}
	Solution solution=new Solution();
	int [] sort=solution.sort(Insertion_sort);
	for(int i=0;i<n;i++)
	{
	    System.out.print(sort[i]+",");
	}
	}
}
class Solution
{
    public static int[] sort(int [] Insertion_sort)
    {
        int n=Insertion_sort.length;
        
        for (int i=1;i<n ;i++ )
        { 
            int key=Insertion_sort[i];
            int j=i-1;
            while (j>=0&&Insertion_sort[j]>key)
            {
                Insertion_sort[j+1]=Insertion_sort[j];
                j-=1;
                
            }
            Insertion_sort[j+1]=key;
        }
        return Insertion_sort;
    }
}
