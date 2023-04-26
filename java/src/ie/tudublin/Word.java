package ie.tudublin;

import java.util.ArrayList;

public class Word {

    private ArrayList<Follow> follow = new ArrayList<Follow>();
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Word(String word) {
        this.word = word;
        follow = new ArrayList<Follow>();
    }

    @Override
    public String toString() {
        return this.word + this.follow;
    }
}
