/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	{
		String str="mams";
		int isPalindrome=isPalindrome(str) ;
		System.out.print(isPalindrome);
	}

public static int isPalindrome(String str)
{
    int left=0;
    int right=str.length()-1;
    
    while(left<right)
    {
    if (str.charAt(left)!=str.charAt(right)) 
     {
       return 0;
       
    }
       left++;
       right--;
    }
      return 1;
    }

}

    