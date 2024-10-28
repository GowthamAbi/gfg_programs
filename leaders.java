/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class FindLeaders
{
    static ArrayList<Integer>leaders(int n,int[] arr)
    {
        List<Integer>result=new ArrayList<>();
        int maxright=arr[n-1];
        result.add(maxright);
        for (int i=n-2;i>=0 ;i-- ) 
        {
            if(arr[i]>=maxright)
            {
                result.add(arr[i]);
                maxright=arr[i];
            }
        }
        return result ;
    }
}


public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		FindLeaders findLeaders=new FindLeaders();
		ArrayList<Integer>leaders=findLeaders.ArrayList(n,arr);
		System.out.print(leaders);
	}
}
