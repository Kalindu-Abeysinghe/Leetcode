import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    

    public static void main(String[] args){
        String[] strArray={"12","13","145678","15","16","17","18","19","20"};
        System.out.println(strArray[2].indexOf("7"));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public String method(List<String> strArray, String commonPrefix){

        List<String> firstCharEquals=new ArrayList<>();

        for(String str : strArray){
        }
        return "";
    }
}
