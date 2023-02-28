public class ReverseInteger {
    

    public static void main(String[] args){
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {

        String intString=String.valueOf(x);

        if(x<0){
            intString=intString.substring(1, intString.length());
            return 0-reversePositiveInt(intString);
        }
        else {
            return reversePositiveInt(intString);
        }
    }

    public static int reversePositiveInt(String intString){
        char[] charArray=intString.toCharArray();
        char[] reverseArray=new char[charArray.length];

        for(int i=0; i<charArray.length; i++){
            reverseArray[i]=charArray[charArray.length-1-i];
        }

        try{
            return Integer.parseInt(String.valueOf(reverseArray));
        }
        catch(NumberFormatException e){
            return 0;
        }
    }
}
