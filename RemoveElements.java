import java.util.Arrays;

public class RemoveElements {

    public static void main(String[] args){

        int[] numArray={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(numArray, 2));
    }


    public static int removeElement(int[] nums, int val) {
        int[] newArray=new int[nums.length];
        int newArrayIndex=0;

        for (int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                newArray[newArrayIndex]=nums[i];
                nums[newArrayIndex]=nums[i];
                newArrayIndex++;
            }
        }
        
        return newArrayIndex;
    }

    
}
