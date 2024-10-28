/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int[] my_array = {64, 34, 25, 12, 22, 11, 90, 5};
		int n=my_array.length;
		for(int i=0;i<n-1;i++)
		{
		    for (int j=0;j<i-1 ;j++ )
		    {
		        if (my_array[j]>my_array[j+1]) 
		        {
		            int temp=my_array[j];
		            my_array[j]=my_array[j+1];
		            my_array[j+1]=temp;

		        }
		    }
		}
		System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
        System.out.println();

	}
}
