package src;

public class Main {

    public static void main(String[] args) {
        String s = "gdfvcxvsd";

        int count = Commands.countSentences(s);
        System.out.println(count);
        int count2 = Commands.countChar(s, 'y');
        System.out.println(count2);
        int count3 = Commands.countWords(s);
        System.out.println(count3);
        StringBuilder sb = new StringBuilder(s);
        Commands.replaceWord(sb, "vdfv", "vdfvd");
        System.out.println(sb);

    }
}