package ru.kpfu.itis.App;

public class Commands{



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