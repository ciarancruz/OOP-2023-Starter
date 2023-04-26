package ie.tudublin;

public class Follow {
    
    private String word;
    private int count;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getCount() {
        return (String) count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }

    @Override
    public String toString() {
        return this.word + this.count;
    }
}
