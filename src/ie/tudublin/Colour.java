package ie.tudublin;

class Colour{
    private String colour;
    public int r, g, b;

   
    Colour(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
        
    }

    public String toString(int r, int g, int b){
        
        // If statements for each colour value and then return colour as string?
        return String colour;
    }


    /**
     * @return the r
     */
    public int getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public int getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }
     
}