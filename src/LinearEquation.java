public class LinearEquation {

// variables needed for class
    private int x1; //x coordinate of first pair
    private int y1; //y coordinate for first pair
    private int x2; //x coordinate for second pair
    private int y2; // y coordinate for second pair
    private String m; // slope in string format
    private double yInt; //y intercept of the two points
    private String slopeIntForm; // the equation in slope intercept form
    private double distance; //distance between 2 points
    private double doubleSlope; // slope in double format


//constructor to initialize coordinates and call methods
    public LinearEquation(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    distanceAndSlope(); //calculates distance and slope
    yIntercept(); //calculates y intercept
    slopeInterceptForm(); // formats into slope intercept form

    }

    public LinearEquation() { // default constructor
    }

    public void x1y1 (String input)
    {
        int length = input.length()-1; // sets length of input to length minus one
        String coordinatesWithoutParenthesis = input.substring(1, length); //substrings index one to length to remove parenthesis
        int index = input.indexOf(",") -1; // sets index to index of comma minus one
        this.x1 = Integer.parseInt(coordinatesWithoutParenthesis.substring(0, index)); // substrings from index of 0 to index variable and sets x1 to the value
        String yCoordinate = coordinatesWithoutParenthesis.substring(input.indexOf(",")); //substrings from comma to the end for y coordinate
        this.y1 = Integer.parseInt(yCoordinate); //converts the string into integer and sets y1 to the assigned value
    }

    public void x2y2 (String input)
    { // same thing as above
        int length = input.length()-1;
        String b = input.substring(1, length);
        int index = input.indexOf(",") -1;
        this.x2 = Integer.parseInt(b.substring(0, index));
        String d = b.substring(input.indexOf(","));
        this.y2 = Integer.parseInt(d);
    }

    // to calculate the distance and slopeIntForm
    public void distanceAndSlope()
    {
        String tempStringDeltaY;
        String tempStringDeltaX;
        double tempDeltaY;
        double tempDeltaX;
        //calculates the distance using distance formula
        distance = Double.parseDouble(String.format("%.2f",(Math.sqrt(Math.pow((this.x1 - this.x2),2)+Math.pow((this.y1 -this.y2), 2)))));
        //temporary deltas
        tempStringDeltaY =String.valueOf((double) this.y1-this.y2);
        tempDeltaY = ((double) this.y1-this.y2);
        tempStringDeltaX = String.valueOf((double) this.x1-this.x2);
        tempDeltaX = ((double) this.x1-this.x2);

        this.m = tempStringDeltaY + "/"+ tempStringDeltaX;

        doubleSlope = ((double) this.y1-this.y2)/((double) this.x1-this.x2);

        if (tempDeltaY / tempDeltaX % 1 == 0)
        { // if the values of delta y and delta x are equal, it will set slopeIntForm to 1
            this.m = String.valueOf(tempDeltaY / tempDeltaX);
        }
        else if (tempDeltaY <0  && tempDeltaX < 0 && tempDeltaY != tempDeltaX)
        { // if delta x and delta y are both negatives and not equal to each other, it'll set both of them positive
            tempDeltaX = tempDeltaX * -1;
            tempDeltaY = tempDeltaY * -1;
            this.m = (int) tempDeltaY +"/"+(int) tempDeltaX;
        }
        else if (tempDeltaY >0 && tempDeltaX <0 )
        {
            // if delta y is positive and delta x is negative, it'll move the negative sign to the left
            tempDeltaY = tempDeltaY * -1;
            tempDeltaX = tempDeltaX * -1;
            this.m = (int) tempDeltaY +"/"+(int) tempDeltaX;
        }

    }

    public void yIntercept(){
        double temp; // temporary value for value of slope times first x coordinate
        temp = ((double) this.x1* doubleSlope);
        if (temp < 0)
        {
            yInt = this.y1 + Math.abs(temp); // if temp is less than 0 then set y intercept to absolute value of temp
        } else {
            yInt = this.y1 - temp;
            yInt = Math.round(yInt * 100.0)/100.0;
        }

    }

    public void slopeInterceptForm()
    { // returns the slope intercept form of equation
        if (yInt < 0){
            slopeIntForm = "y = " + m + "x " + "- " + (Math.round(yInt *100.00)/100.00) * -1; // if the value is negative, remove the negative sign and add a subtraction sign before it
        } else {
            slopeIntForm = "y = "+ m + "x + " + Math.round(yInt *100.00)/100.00;
        }
    }

    public int x1(){
        return x1; //returns value of x1
    }
    public int y1(){
        return y1; //returns value of y1
    }
    public int x2(){
        return x2; //returns value of x2
    }
    public int y2(){
        return y2; //returns value of y2
    }

    public String solver (double input)
    { // solves for Y value given x value
        double x = input;
        double solvedY;
         solvedY = doubleSlope * input + yInt;
       return "Solved coordinate point is: (" + x + "," + Math.round(solvedY *100.00)/100.00 + ")"; //returns coordinate pair of x and solved y value
    }

    public String toString(){
       String str = "\n"+"First Pair: (" +this.x1+","+this.y1+")"+"\n"+
                    "Second Pair: ("+this.x2+","+this.y2+ ")"+"\n"+
                    "The Slope is: "+this.m+"\n"+
                    "The Y intercept is: " + Math.round(yInt *100.00)/100.00 + "\n" +
                    "Slope intercept form: " + slopeIntForm + "\n" +
                    "The distance between these 2 points is: "+ distance + "\n";
       return str;
    }
}
