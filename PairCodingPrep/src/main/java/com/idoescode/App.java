package com.idoescode;

/**
 * Hello world!
 *
 */
public class App 
{
    public int returnFive() {
        return 5;
    }

    public int returnFiveOrSix(int num) {
        return num;
    }

    public int numWords(String word) {
        word = word.trim();
        int count = 0;
        String[] words = word.split(" ");
        for (int i = 0; i < words.length; i++) {
            if ( words[i].indexOf('s') == 0 ||
                    words[i].indexOf('S') == 0
            ) {
                count++;
            }
        }

        return count;
    }
}
