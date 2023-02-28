public class AddTwoNumbers {

    public static void main(String[] args){
        System.out.println(Character.MIN_RADIX);
        // addTwoNumbers(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))), new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(4, null))));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] l1Array = new int[100];
        int[] l2Array = new int[100];
        int l1Index = 0;
        int l2Index=0;

        while (l1 != null) {
            l1Array[l1Index] = l1.val;
            l1 = l1.next;
            l1Index++;
        }

        while (l2 != null) {
            l2Array[l2Index] = l2.val;
            l2 = l2.next;
            l2Index++;

        }

        int k=0;
        for (int i=0;i<l1Index;i++){
            k=10*k + l1Array[l1Index-1-i];
        }

        int j=0;
        for (int i=0;i<l2Index;i++){
            j=10*j + l2Array[l2Index-1-i];
        }

        Integer sum=k+j;
        char [] intChars=String.valueOf(sum).toCharArray();
        int [] intArray=new int[intChars.length];
        for (int i =0; i<intArray.length; i++){
            intArray[i]=Integer.parseInt(String.valueOf(intChars[intArray.length-1-i]));
        }
        ListNode nodeToReturn=getNode(intArray, 0);

        while(nodeToReturn!=null){
            System.out.println("nodeVal: " +nodeToReturn.val);
            nodeToReturn=nodeToReturn.next;
        }
        System.out.println("\nSUM: "+String.valueOf(k+j));
        return nodeToReturn;
    }

    static ListNode getNode(int[] intArray, int arrayIndex){


        try{
            if(arrayIndex==intArray.length-1){
                return new ListNode(intArray[intArray.length-1]);
            }
            else{
                int tempArrayIndex=arrayIndex;
                arrayIndex+=1;
               return new ListNode(intArray[tempArrayIndex], getNode(intArray, arrayIndex));
            }
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            return null;
        }

    }

    public static ListNode addTwoNumbersByStack(ListNode l1, ListNode l2){
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbersChatGpt(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        
        return dummy.next;
    }
}
