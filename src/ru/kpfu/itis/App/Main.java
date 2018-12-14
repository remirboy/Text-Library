package ru.kpfu.itis.App;

public class Main {

    public static void main(String[] args) {
        String s = "I was just was say about was this? What was are you are doing.... Nothing!";

        int count = Commands.countSentences(s);
        System.out.println(count);
        int count2 = Commands.countChar(s, 'y');
        System.out.println(count2);
        int count3 = Commands.countWords(s);
        System.out.println(count3);
        StringBuilder sb = new StringBuilder(s);
        Commands.replaceWord(sb, "Nothing", "Always");
        System.out.println(sb);
        int count4 = Commands.countWordRepeat("was",s);
        System.out.println(count4);
    }
}