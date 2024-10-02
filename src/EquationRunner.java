import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first Coordinate Point: ");
        String firstCoordinate = s.nextLine();


        LinearEquation coordinate1 = new LinearEquation();
        coordinate1.x1y1(firstCoordinate);

        System.out.println("Enter your second Coordinate Point: ");
        String secondCoordinate = s.nextLine();
        LinearEquation coordinate2 = new LinearEquation();
        coordinate2.x2y2(secondCoordinate);

        System.out.println(coordinate1);
        System.out.println(coordinate2.toString2());
    }

}