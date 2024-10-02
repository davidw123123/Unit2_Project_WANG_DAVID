public class LinearEquation {


    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double m;
    private double yInt;
    private String slope;
    private int index;

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

    public int x1(){
        return x1;
    }

    public LinearEquation(int x, int y){

    }


    public String toString(){
       String str = this.x1+","+this.y1;
       return str;
    }
    public String toString2(){
        return this.x2+","+this.y2;
    }
}
