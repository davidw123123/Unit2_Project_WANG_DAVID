public class LinearEquation {


    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String m;
    private double yInt;
    private double slope;
    private int index;
    private double distance;
    private double temp;
    private double a;
    private String b;
    private String c;
    private int b1;
    private int b2;

    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        distanceAndSlope();
        yIntercept();
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

    // to calculate the distance and slope
    public void distanceAndSlope(){
        distance = Math.sqrt(Math.pow((this.x1 - this.x2),2)+Math.pow((this.y1 -this.y2), 2));
        b =String.valueOf(this.y1-this.y2);
        b1 = (this.y1-this.y2);
        c = String.valueOf(this.x1-this.x2);
        b2 = (this.x1-this.x2);

        this.m = b + "/"+c;

        a = ((double) this.y1-this.y2)/((double) this.x1-this.x2);



//        if (b1 <0  && b2 < 0 && b1 != b2) {
//            b2 = b2*-1;
//            b1 = b1 *-1;
//            c = String.valueOf(b2);
//            b = String.valueOf(b1);
//            this.m = b + "/"+c;
//        }else {
//            if (b2 < 0 & b1 != b2) {
//                b1 = b1 * -1;
//                b2 = b2 * -1;
//                c = String.valueOf(b2);
//                b = String.valueOf(b1);
//                this.m = b + "/" + c;
//                if ((Math.abs(b1) / b2) % 1 == 0) {
//                    this.m = String.valueOf(b1 / b2);
//                } else {
//                    if (b1 == b2) {
//                        this.m = "1";
//                    } else {
//                if ( (Math.abs(b1)/b2) % 1 == 0 ){
//                    this.m = "-"+String.valueOf(b1/b2);
//                }
//
//                    }
//                }
//            }
//        }


    }

    public void yIntercept(){
        this.temp = ((double) this.x1* a);
        if (temp < 0) {
            yInt = this.y1 + Math.abs(this.temp);
        }else {
            yInt = this.y1 - temp;
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

    public String toString(){
       String str = "\n"+"First Pair: (" +this.x1+","+this.y1+")"+"\n"+
                    "Second Pair: ("+this.x2+","+this.y2+ ")"+"\n"+
                    "The distance between these 2 points is: "+ distance + "\n"+
                    "The Slope is: "+this.m+"\n"+
                    "The Y intercept is: " + yInt+"\n"+b+" "+ c;
       return str;
    }
}
