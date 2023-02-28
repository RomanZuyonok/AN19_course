package homework5;

public class HomeWork1 {
    public static void main(String[] args) {

        String[][] chessboard = new String[8][8];

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if ((i + j) % 2 == 0) {
                    chessboard[i][j] = "W";
                } else {
                    chessboard[i][j] = "B";
                }
            }
        }

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
               System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }

    }
}
