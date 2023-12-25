public class CandyCrush {
    /*
                {'1', '1', '4', '5', '2', '6', '5', '5', '6', '7'},
                {'1', '2', '2', '2', '2', '6', '9', '6', '2', '8'},
                {'8', '5', '2', '1', '8', '8', '8', '7', '3', '4'},
                {'4', '2', '1', '6', '7', '7', '7', '3', '5', '1'},
                {'4', '2', '4', '6', '7', '1', '1', '5', '6', '2'},
                {'4', '2', '1', '6', '9', '4', '6', '1', '9', '9'},
                {'4', '2', '7', '4', '9', '9', '9', '9', '1', '2'},
                {'1', '2', '2', '2', '2', '6', '9', '6', '2', '8'},
                {'8', '5', '2', '1', '8', '8', '8', '7', '3', '4'},
                {'4', '2', '1', '6', '9', '4', '6', '1', '9', '9'}

    *
    */
    public static void main(String[] args) {
        char[][] board={
                {'1', '1', '4', '5', '2', '6', '5', '5', '6', '7'},
                {'1', '2', '2', '2', '2', '6', '9', '6', '2', '8'},
                {'8', '5', '2', '1', '8', '8', '8', '7', '3', '4'},
                {'4', '2', '1', '6', '7', '7', '7', '3', '5', '1'},
                {'4', '2', '4', '6', '7', '1', '1', '5', '6', '2'},
                {'4', '2', '1', '6', '9', '4', '6', '1', '9', '9'},
                {'4', '2', '7', '4', '9', '9', '9', '9', '1', '2'},
                {'1', '2', '2', '2', '2', '6', '9', '6', '2', '8'},
                {'8', '5', '2', '1', '8', '8', '8', '7', '3', '4'},
                {'4', '2', '1', '6', '9', '4', '6', '1', '9', '9'}
        };
        int col=4;
        int row=5;
        printBoard(board);
        System.out.println();
        gameBoard(col-1,row-1,board);
        printBoard(board);

    }
// değişkeni alma
    private static void gameBoard(int col, int row, char[][] board) {
        char temp=board[col][row];
        drawBoard(col,row,board,temp);
    }
// recursive halinde oyun tahtasını gezen method
    private static void drawBoard(int col, int row, char[][] board, char temp) {
        if(col<0 || col>= board.length || row<0 || row>=board.length || board[col][row] != temp ){
            return;
        }
        board[col][row]='X';
        // sağa
        drawBoard(col,row+1,board,temp);
        // sola
        drawBoard(col,row-1,board,temp);
        // asaği
        drawBoard(col+1,row,board,temp);
        // yukari
        drawBoard(col-1,row,board,temp);

    }
    public static void printBoard(char[][] board){
        for (char[] x: board){
            for (char y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }


}
