package LeetCode.BitManipulation;

public class AdBinary {
    public static void main(String[] args){
        System.out.println(addBinary("11"));
    }
    public static String addBinary(String s){
        String res = "";
        char b = '1';
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)=='1' & b == '1'){
                res = String.valueOf('0') + res;
            }
            else{
                res = String.valueOf('1') + res;
                b = '0';
                res = s.substring(0, i) + res;
                break;
            }
        }
        
        if(b == '1'){
            res = String.valueOf('1') + res;
        }

        return res;
    }
    
}
