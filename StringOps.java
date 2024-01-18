public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
         String newst = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            int ascii = (int) ch;
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                newst = newst + ch;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ch = (char) (ascii - 32);
                newst = newst + ch;
            } else if (ascii >= 65 && ascii <= 90) {
            ch = (char) (ascii + 32);
            newst = newst + ch;
            } else {
            newst = newst + ch;
            }
        }
        return newst;
    }
    public static String camelCase (String string) {
        // Write your code here:
        String newWord = "";
        String newst = "";
        int i = 0;
        int ascii = 0;
        int j = 0 ;
        while (string.charAt(i) == ' ') {
            i ++ ;
        }
        newWord = string.substring(i);
        ascii = (int) newWord.charAt(0);
        if (ascii >= 65 && ascii <= 90) {
            newst = newst + (char) (ascii + 32);
        }
        if (ascii >= 97 && ascii <= 122) {
            newst = newst + newWord.charAt(0);
        }
        boolean isFirstLetter = false;
        while (j < newWord.length()) {
            char ch = newWord.charAt(j);
            if (ch == ' ') {
                isFirstLetter = true;
            }
            else {
                if ((newWord.charAt(j) >= 'a' && newWord.charAt(j) <= 'z') && isFirstLetter == false){
                    newst = newst + (char) (newWord.charAt(j));
                } else if ((newWord.charAt(j) >= 'A' && newWord.charAt(j) <= 'Z') && isFirstLetter == true){
                    newst = newst + (char) (newWord.charAt(j));
                
                } else if ((newWord.charAt(j) >= 'A' && newWord.charAt(j) <= 'Z') && isFirstLetter == false){
                    newst = newst + (char) (newWord.charAt(j) + 32);
                } else if ((newWord.charAt(j) >= 'a' && newWord.charAt(j) <= 'z') && isFirstLetter == true){
                    newst = newst + (char) (newWord.charAt(j) - 32);
                }
                isFirstLetter = false;
        }
        j++;
        return newst
        return "";
    }

    public static int[] allIndexOf(String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (chr == string.charAt(i)) {
                count ++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int j = 0; j < string.length(); j++) {
            if (chr == string.charAt(j)) {
                array[index] = j;
                index++;
            }
        }
        return array;
    }
}
