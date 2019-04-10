/*
Name: Stephen Pearson
Student Number: C17753589
OOP test for drawing resistors 
*/

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	Table table;
	public ArrayList <Colour> colours = new ArrayList<Colour>();
	public ArrayList <Resistor> resistors = new ArrayList<Resistor>();
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		//print(hundreds + ",");
		//print(tens + ",");
		//println(ones);
	}

	public void settings()
	{
		size(800, 800);
		
		//separate(381);
		//separate(1);
		//separate(92);
	}

	public void setup() 
	{
		loadData();
		

	}

	public void loadData(){
		table = loadTable("colours.csv", "header");

		for(TableRow row : table.rows())
		{
			int r = row.getInt("r");
			int g = row.getInt("g");
			int b = row.getInt("b");
			
			Colour c = new Colour(r,g,b);
			
		//	System.out.print(r);
		
		}
		

	}
	
	public void draw()
	{	
		//fill(255);
		stroke(0);
		drawResFrame();
		
	}

	public void drawResFrame(){
	
		float x = height / 4f;
		float y = width / 4f;
		//float barWidth = x/5f;
		//float hx = x + x/2f;
		//float hy = y + y/2f;

	//	System.out.println(x);

		rect(x, y, x/2f, y/2f);
		line(x - x/4, y + y/4, x + x, y + y/4);

		for(int i=0; i < 4; i++)
		{
			//float startPoint = map(i, x, barWidth,  )
			line(x + (i *20), y  , x + (i*20), y + y/2);

			
			//Fetch appropriate colour from Array list data
			//Resistor bar = colours.get(i);
			
			//fill(bar.r, bar.g,bar.b);
			

		}

	}
}
