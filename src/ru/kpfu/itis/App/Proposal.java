package ru.kpfu.itis.App;

public class Proposal {

    public int calcProp(String prop,int length){
        int counter=0;
        for (int i = 0; i<length;i++){
            if((prop.charAt(i)=='.')||(prop.charAt(i)=='!')||(prop.charAt(i)=='?')){
                counter = counter+1;
            }
        }
       return counter;
    }

}
