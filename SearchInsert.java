public class SearchInsert {
    
    public static void main(String[] args){
        int[] nums = {1,3};
        int target = 3;
        System.out.println("index: "+searchInsert(nums, target));
    }


    public static int searchInsert(int[] nums, int target) {
        
        for(int i=0;i<nums.length-1;i++){
            System.out.println(nums[i]+"<"+target+"  "+nums[i+1]+">"+target);

            if(nums[i]==target)
                return i;
            if(nums[i]<target && nums[i+1]>target){
                return i+1;
            }
            
        }
        if(target>nums[nums.length-1])
            return nums.length;
        else
            return 0;
    }

    public static void searchInsertRec(int[] nums){


    }
}
