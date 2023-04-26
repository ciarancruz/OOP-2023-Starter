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

    public int findFollow(String word)
    {
        for(Follow f:follow)
        {
            if(f.getWord().equals(word))
            {
                return follow.indexOf(f);
            }
        }
        return -1;
    }

    public void addFollow(Follow f)
    {
        follow.add(f);
    }

    public ArrayList<Follow> getFollows() {
        return follow;
    }

    public void addFollowCount(Follow f)
    {
        f.setCount(f.getCount() + 1);
    }


    @Override
    public String toString() {
        return this.word + this.follow;
    }
}
