package src;

public class Commands{


    /**
     * The number of entered symbol in the entered String
     * @param text: String where you need to find the number of entered symbol
     * @param c: Symbol which amount you need to find
     * @return counter: The number of symbol in the entered string
     */
    public static int countChar(String text, char c){
        int counter=0;
        int length =text.length();
        for (int i = 0; i<length;i++){
            if(text.charAt(i)==c){
                counter = counter+1;
            }
        }
        return counter;
    }


    /**
     * The number of sentenses in entered String
     * @param text: String where you need to find the number of sentences
     * @return counter: The number of sentences in the entered string
     */

    public static int countSentences(String text){
        int counter=0;
        int length =text.length();
        for (int i = 0; i<length;i++){
            if((text.charAt(i)=='.')||(text.charAt(i)=='!')||(text.charAt(i)=='?')){
                if((text.charAt(i-1)=='.')||(text.charAt(i-1)=='!')||(text.charAt(i-1)=='?')){
                    continue;
                }
                else {
                    counter = counter + 1;
                }
            }
        }
        return counter;
    }

    /**
     * The number of words in the entered string
     * @param text: string where you need to count the number of words
     * @return counter: The number of words in the entered string
     */

    public static int countWords(String text) {
        int counter = 0;
        int length = text.length();
        for (int i = 0; i < length; i++) {
            if ((text.charAt(i) == ' ') || (text.charAt(i) == '.')) {
                if ((text.charAt(i - 1) == ' ') || (text.charAt(i - 1) == '.')) {
                continue;
                } else {
                    counter = counter + 1;
                }
            }
        }
        return counter+1;
    }

   /**
     *
     * This method replaces all words in the StringBuilder by another word
     * @param text: your StringBuilder
     * @param textWord: the word in your StringBuilder that you want to replace
     * @param newWord: the word that you want to put in your StringBuilder instead of another word
     */
    public static void replaceWord(StringBuilder text, String textWord, String newWord){
        int i = 0;
        while((i = text.indexOf(textWord, i)) >= 0){
            text.delete(i, i + textWord.length());
            text.insert(i, newWord);
            i += newWord.length();
        }
    }

}