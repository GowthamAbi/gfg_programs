import java.util.*;
public class Main {
    public static void main(String[] args) {
        String input = "H elpothers";
        String result = reverseStringWithSpacesIntact(input);
        System.out.println(result);  // Output: sreh topleH
    }

    public static String reverseStringWithSpacesIntact(String str) {
        char [] strArray=str.toCharArray();
        int left=0;int right=strArray.length-1;
        while(left<right)
        {
            if(strArray[left]==' ')
            {
                left++;
            }
            else if(strArray[right]==' ')
            {
                right++;
            }
            else{
                char temp=strArray[left];
                strArray[left]=strArray[right];
                strArray[right]=temp;
                left++;
                right--;
            }
        }
        return new String (strArray);
    }
}
