import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args){
        int[] array={1,1,2};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> intSet=new LinkedHashSet<>();

        for(int i : nums){
            intSet.add(Integer.valueOf(i));
        }

        Object[] objArray=intSet.toArray();

        for(int i=0; i<objArray.length;i ++){
            nums[i]=(int) objArray[i];
        }
        return intSet.size();
    }
    
}
