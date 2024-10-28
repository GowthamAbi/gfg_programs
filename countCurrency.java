import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		Solution solution=new Solution();
		solution.countCurrency(amount);
	}
}
class Solution
{
    public static void countCurrency(int amount)
    {
         int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] noteCounter = new int[9];
        for(int i=0;i<9;i++)
        {
            if(amount>=notes[i])
            {
                noteCounter[i]=amount/notes[i];
                amount=amount%notes[i];
            }
        }
        for (int i=0;i<9 ;i++ )
        {
            if(noteCounter[i]!=0)
            {
                System.out.println(notes[i]+":"+noteCounter[i]);
            }
        }
    }
}










