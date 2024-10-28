/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public static List<Integer>findDuplicates(int[] arr,int n)
{
    
    List<Integer>result=new Array<>();
    for(int i=0;i<n;i++)
    {
        int index=Math.abs(arr[i]);
    }
    if(arr[index]>0)
    {
        if(!result.contains(index))
        {
            result.add(index);
        }
    }
    else
    {
        arr[index]=-arr[index];
    }
    
}

result.add(-1);
public class Main
{
	public static void main(String[] args) {
	int[] arr1 = {0, 3, 1, 2};
        System.out.println(findDuplicates(arr1, 4));  // Output: [-1]

        int[] arr2 = {2, 3, 1, 2, 3};
        System.out.println(findDuplicates(arr2, 5));  // Output: [2, 3]
	}
}
