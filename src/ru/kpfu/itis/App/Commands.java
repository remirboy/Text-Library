package ru.kpfu.itis.App;

public class Commands{


    /**
     * Number of entered symbol in enterned String
     * @param text: String where you find number of entered symbol
     * @param c: Simbol which number need to find
     * @return counter: symbol's number in entered string
     */
    public static int calcChar(String text, char c){
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
     * Number of sentenses in entered sentence
     * @param text: String where you need to find numbers of sentences
     * @return counter: numbers of sentences in enterned string
     */

    public static int calcSentences(String text){
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
     * Number of words in entered string
     * @param text: string where you need to count words
     * @return counter: number of words in entered string
     */

    public static int calcWords(String text) {
        int counter = 0;
        int length = text.length();
        for (int i = 0; i < length; i++) {
            if ((text.charAt(i) == ' ')||(text.charAt(i) == '.')) {
                if((text.charAt(i-1) == ' ')||(text.charAt(i-1) == '.')){
                    continue;
                }
                else {
                    counter = counter + 1;
                }
            }
        }
        counter = counter++;
        return counter;
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