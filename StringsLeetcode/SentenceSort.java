package StringsLeetcode;

public class SentenceSort {
    public static String sortSentence(String s) {
        String[] org = s.split(" ", 9);
        String[] res = new String[org.length];

        for(int i = 0; i < org.length; i++){
            char lastChar = org[i].charAt(org[i].length() - 1);
            int index = lastChar - '0';
            res[index-1] = org[i].substring(0, org[i].length()-1);
        }

        String result = String.join(" ", res);
        return result;
    }

    public static void main(String[] args){
        String sentence = sortSentence("QcGZ4 TFJStgu3 HvsRImLBfHd8 PaGqsPNo9 mZwxlrYzanuVOUZoyNjt1 fzhdtYIen6 mV7 LKuaOtefsixxo5 pwdEK2");
        System.out.println("Sorted sentence: " + sentence);
    }
}
