package LeetCode.StringsLeetcode;

public class halvesAlike {
    public static boolean isVowel(char str){
        switch(Character.toLowerCase(str)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static boolean halvesAreAlike(String s) {
        int count1 = 0, count2 = 0;
        String halved1 = s.substring(0, s.length()/2);
        String halved2 = s.substring(s.length()/2);
        for(char ele: halved1.toCharArray()){
            if(isVowel(ele)){
                count1++;
            }
        }
        for(char ele: halved2.toCharArray()){
            if(isVowel(ele)){
                count2++;
            }
        }
        return count1 == count2;
    }

    public static void main(String[] args){
        String s = "textbook";
        boolean res = halvesAreAlike(s);
        System.out.println(String.format("Given word %s is %s", s,res?"alike":"not alike" ));
    }
}
