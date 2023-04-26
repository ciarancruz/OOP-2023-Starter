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

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        
    }
}
