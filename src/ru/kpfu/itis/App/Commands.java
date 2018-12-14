package ru.kpfu.itis.App;

public class Commands{


    /**
     * Number of entered symbol in enterned String
     * @param prop:String where you find number of entered symbol
     * @param c: Simbol which number need to find
     * @return counter: symbol's number in entered string
     */
    public static int calcChar(String prop, char c){
        int counter=0;
        int length =prop.length();
        for (int i = 0; i<length;i++){
            if(prop.charAt(i)==c){
                counter = counter+1;
            }
        }
        return counter;
    }


    /**
     * Number of sentenses in entered sentence
     * @param prop: String where you need to find numbers of sentences
     * @return counter numbers of sentences in enterned string
     */

    public static int calcProp(String prop){
        int counter=0;
        int length =prop.length();
        for (int i = 0; i<length;i++){
            if((prop.charAt(i)=='.')||(prop.charAt(i)=='!')||(prop.charAt(i)=='?')){
                if((prop.charAt(i-1)=='.')||(prop.charAt(i-1)=='!')||(prop.charAt(i-1)=='?')){
                    continue;
                }
                else {
                    counter = counter + 1;
                }
            }
        }
        return counter;
    }
}