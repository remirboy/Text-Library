package ru.kpfu.itis.App;

import java.io.File;
import java.util.Scanner;

/**
 * @author Remir Ziatdinov "remirboy@yandex.ru"
 * @author Daniyar Sadikov
 */


public class Main {

    public static void main(String[] args) {
        String s = "ygytgd t5asdads.. jk.. koik!? red.";

        int count=Commands.calcProp(s);
        System.out.println(count);
        int count2=Commands.calcChar(s,'y');
        System.out.println(count2);
        int count3=Commands.calcWords(s);
        System.out.println(count3);

      // File file = new File("C://Users//Ремир//Desktop//proj.txt");

    }
}
