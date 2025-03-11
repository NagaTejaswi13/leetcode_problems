

public class Smallest {
    public static char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i<letters.length; i++){
            char c = letters[i];
            if(target > c){
                return c;
            }
        }
        return letters[0];
    }

    public static void main(String[] args){
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
    }
}
