public class LinearEquation {


    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String m;
    private double yInt;
    private String slopeIntForm;
    private int index;
    private double distance;
    private double temp;
    private double a;
    private String b;
    private String c;
    private double b1;
    private double c1;
    private double x;
    private double solvedY;

    public LinearEquation(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    distanceAndSlope();
    yIntercept();
    slopeInterceptForm();
    }

    public LinearEquation() {
    }

    public void x1y1 (String input){
    int length = input.length()-1;
    String a = input.substring(1, length);
    int index = input.indexOf(",") -1;
    this.x1 = Integer.parseInt(a.substring(0, index));
    String c = a.substring(input.indexOf(","));
    this.y1 = Integer.parseInt(c);
    }

    public void x2y2 (String input){
    int length = input.length()-1;
    String b = input.substring(1, length);
    int index = input.indexOf(",") -1;
    this.x2 = Integer.parseInt(b.substring(0, index));
    String d = b.substring(input.indexOf(","));
    this.y2 = Integer.parseInt(d);
    }

    // to calculate the distance and slopeIntForm
    public void distanceAndSlope(){
    distance = Double.parseDouble(String.format("%.2f",(Math.sqrt(Math.pow((this.x1 - this.x2),2)+Math.pow((this.y1 -this.y2), 2)))));
    b =String.valueOf((double) this.y1-this.y2);
    b1 = ((double) this.y1-this.y2);
        c = String.valueOf((double) this.x1-this.x2);
        c1 = ((double) this.x1-this.x2);

        this.m = b + "/"+c;

        a = ((double) this.y1-this.y2)/((double) this.x1-this.x2);

        if (b1/c1 % 1 == 0){ // if the values of delta y and delta x are equal, it will set slopeIntForm to 1

        this.m = String.valueOf(b1/c1);

        } else if (b1 <0  && c1 < 0 && b1 != c1) { // if delta x and delta y are both negatives and not equal to each other, it'll set both of them positive

        c1 = c1 * -1;
        b1 = b1 * -1;
        this.m = (int) b1+"/"+(int) c1;

        } else if (b1>0 && c1<0 ){ // if delta y is positive and delta x is negative, it'll move the negative sign to the left

        b1 = b1 * -1;
        c1 = c1 * -1;
        this.m = (int) b1+"/"+(int) c1;

        }

    }

    public void yIntercept(){
        this.temp = ((double) this.x1* a);
        if (temp < 0) {
            yInt = this.y1 + Math.abs(this.temp);
        } else {
            yInt = this.y1 - temp;
            yInt = Math.round(yInt * 100.0)/100.0;
        }

    }

    public void slopeInterceptForm(){
        if (yInt < 0){
            slopeIntForm = "y = " + m + "x " + Math.round(yInt *100.00)/100.00;
        } else {
            slopeIntForm = "y = "+ m + "x + " + Math.round(yInt *100.00)/100.00;
        }
    }

    public int x1(){
        return x1;
    }
    public int y1(){
        return y1;
    }
    public int x2(){
        return x2;
    }
    public int y2(){
        return y2;
    }

    public void solver (double input){
        double x = input;
         this.solvedY = a * input + yInt;
        System.out.println("Solved coordinate point is: (" + x + "," + this.solvedY + ")");
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
