package ie.tudublin;

import processing.core.PApplet;

class Resistor extends PApplet
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;


    public Resistor(int value)
    {
        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));

        print(hundreds + ",");
        print(tens + ",");
        println(ones);

    }

}