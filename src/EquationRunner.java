import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {



        Scanner s = new Scanner(System.in);
        LinearEquation coordinate = new LinearEquation();

        // asks for first coordinate point, then substrings
        System.out.print("Enter your first Coordinate Point: ");
        String firstCoordinate = s.nextLine();
        coordinate.x1y1(firstCoordinate);

        // asks for second coordinate point, then substrings
        System.out.print("Enter your second Coordinate Point: ");
        String secondCoordinate = s.nextLine();
        coordinate.x2y2(secondCoordinate);

        LinearEquation result = new LinearEquation(coordinate.x1(), coordinate.y1(),coordinate.x2(), coordinate.y2());

        //asks the user for an x value and prints the corresponding points
        System.out.println(result);
        System.out.print("Enter a third x-value: ");
        double thirdCoordinate = s.nextDouble();
        result.solver(thirdCoordinate);
    }

}