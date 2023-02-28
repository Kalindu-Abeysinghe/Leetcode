import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.stream.events.Characters;

public class IsPalindrome {

    public static void main(String[] args){
        System.out.println(IsPalindromeNew(123211));
    }

    public static boolean IsPalindrome(int i){
        String s=String.valueOf(i);
        char[] charArray=s.toCharArray();
        char[] reverseArray = new char[charArray.length];
       
        for(int index=0;index < s.length();index++){
            reverseArray[index]=charArray[charArray.length-1-index];
        }

        for(int index=0;index < s.length();index++){
            if(reverseArray[index]!=charArray[index])
                return false;
        }
        return true;

    }

    public static boolean IsPalindromeNew(int x){
        String s=String.valueOf(x);
        int length=s.length();

        for(int i=0;i<length;i++){
            if(s.charAt(i)!= s.charAt(length-1-i))
                return false;
        }
        return true;
    }
    
}
