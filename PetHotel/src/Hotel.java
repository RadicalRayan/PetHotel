public class Hotel {
    private int numRow;
    private int numCol;
    private Room[][] rooms;

    public Hotel(int row, int col) {
        numRow = row;
        numCol = col;
        rooms = new Room[numRow][numCol];

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                rooms[i][j] = new Room(""+i+" "+j);
            }
        }
    }

    public void printHotel() {
        repP(12);
        for(int i = 0; i < rooms[0].length; i++) {
            System.out.print("|");
            repP(12/2-1);
            System.out.print(rooms[0][i].getName(true));
            repP(12/2);
        }
        System.out.println("|");

        printLine();

        for (int i = rooms.length; i >= 1 ; i--) {
            repP(5);
            System.out.print(i);//numRow - Integer.parseInt(rooms[i][0].getName(false))
            if(i>9)
                repP(5);
            else
                repP(6);
            System.out.print("|");
            for(int j = 0; j < rooms[i-1].length; j++) {
                System.out.print(rooms[i-1][j]);
                System.out.print("|");
            }
            System.out.println();
            printLine();
        }
    }

    private void printLine() {
        repP(12, '-');

        for (int i = 0; i < rooms[0].length; i++) {
            System.out.print("+");
            repP(12, '-');
        }
        System.out.println("+");

    }

    private void repP(int p) {
        for (int i = 0; i < p; i++) {System.out.print(" ");}
    }

    private void repP(int p, char c) {
        for (int i = 0; i < p; i++) {System.out.print(c);}
    }
}
