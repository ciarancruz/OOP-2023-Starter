package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;

public class DANI extends PApplet {

	

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

	String[] file;
	String[] words;

	public void loadFile() {
		file = loadStrings("small.txt"); // Load a text file into a String array
		for (int i = 0; i < file.length; i++)
		{
			 file[i].split(" ");
		}

	}

	public boolean findWord(String exist) {
		for (int i = 0; i < words.length; i++)
		{
			if (exist.equals(words[i]) == true)
			{
				return false;
			}
			else 
			{
				return true;
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
