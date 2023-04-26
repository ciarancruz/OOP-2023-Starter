package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word> model;
	ArrayList<Follow> follow;
	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		model = new ArrayList<Word>();
		loadFile();
		// printModel();
       
	}

	String[] words;

	public void loadFile()
	{
		String[] line = loadStrings("small.txt");
		for(int i = 0; i < line.length; i ++)
		{
			words = split(line[i], " ");

			//Goes through each line
			for(int j = 0; j < words.length; j ++)
			{
				words[j] = words[j].replaceAll("[^\\w\\s]", ""); //Remove punctuation
				words[j] = words[j].toLowerCase(); // Convert string to lowercase

				//Checks if the next word is the last word
				boolean last;
				if(j + 1 == words.length)
				{
					last = true;
				}
				else
				{
					last = false;
				}
				
				if(!last)
				{
					words[j+1] = words[j+1].replaceAll("[^a-zA-Z ]", " ");
					words[j+1] = words[j+1].toLowerCase();
				}
				
				//Checks if the word is in the word bank already
				Word word;
				int result = findWord(words[j]);
				
				if(result == -1)
				{
					word = new Word(words[j]);
					model.add(word);
				}
				else
				{
					word = model.get(result);
				}

				
				// //Check for following words
				// if(!last)
				// {	
				// 	if(word.findFollow(words[j+1]) == -1)
				// 	{
				// 		word.addFollow(new Follow(words[j+1], 1));
				// 	}
				// 	else
				// 	{
				// 		word.addFollowCount(word.getFollows().get(word.findFollow(words[j+1])));
				// 	}
				// }
			}
		}
	}

	public int findWord(String exist) {
		for (int i = 0; i < words.length; i++)
		{
			if (exist.equals(words[i]) == true)
			{
				return 0;
			}
		}
		return -1;
	}

	public void printModel()
	{
		for(Word w:model)
		{
			System.out.println(w.toString());
		}
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
