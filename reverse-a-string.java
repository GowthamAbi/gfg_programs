/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    Reverse reverse=new Reverse();
		String reverseWord=reverse.reverseWord(str);
		System.out.print(reverseWord);
	}
}
class Reverse
{
    public static String reverseWord(String str)
    {
     int len=str.length();
     StringBuilder rev=new StringBuilder();
     for (int i=len-1;i>=0 ;i-- )
     {
         rev.append(str.charAt(i));
     }
     return rev.toString();
    }
}
 