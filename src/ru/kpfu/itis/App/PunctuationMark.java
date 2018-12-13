package ru.kpfu.itis.App;

public class PunctuationMark extends Proposal{
    public int calcChar(String prop,int length, char c){
        int counter=0;
        for (int i = 0; i<length;i++){
            if(prop.charAt(i)==c){
                counter = counter+1;
            }
        }
        return counter;
    }
}
