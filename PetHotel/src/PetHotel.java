import java.util.Scanner;

public class PetHotel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the PetHotel!");
        int col = 7;
        int row = 10;
        boolean enterCols = true;
        boolean enterRows = true;
        while(enterCols) {
            System.out.print("Enter the number of Columns: ");
            String temp = in.next();
            try {
                col = Integer.parseInt(temp);
                enterCols = false;
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid number of columns.\n");
            }
        }
        while(enterRows) {
            System.out.print("Enter the number of Rows: ");
            String temp = in.next();
            try {
                row = Integer.parseInt(temp);
                enterRows = false;
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid number of rows.\n");
            }
        }
        Hotel hotel = new Hotel(row, col);
        boolean play = true;

        hotel.printHotel();
    }
}
