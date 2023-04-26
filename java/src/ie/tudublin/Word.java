package ie.tudublin;

import java.util.ArrayList;

public class Word {

    ArrayList<Follow> follow = new ArrayList<Follow>();
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Word(String word, ArrayList<Follow> follow) {
        this.word = word;
        this.follow = follow;
    }

    @Override
    public String toString() {
        return this.word + this.follow;
    }
}
