package LeetCode.StringsLeetcode;

public class ShuffledString {

    public static String restoreString(String s, int[] indices) {
        char[] shuffledString = new char[indices.length];
        for(int i = 0; i<indices.length; i++){
            shuffledString[indices[i]] = s.charAt(i);  
        }
        return String.valueOf(shuffledString);
        
    }

    public static void main(String[] args){
        
        System.out.println(restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }
}
