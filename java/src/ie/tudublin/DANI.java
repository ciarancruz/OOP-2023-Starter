package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;

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
		loadFile();
       
	}


	// public void loadFile() {
	// 	file = loadStrings("small.txt"); // Load a text file into a String array
	// 	for (int i = 0; i < file.length; i++)
	// 	{
	// 		file[i].split(" ");
	// 	}

	// }

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
				
				if(last == false)
				{
					words[j+1] = words[j+1].replaceAll("[^a-zA-Z ]", "");
					words[j+1] = words[j+1].toLowerCase();
				}
				System.out.println(words[j]);
				
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
