public class Board {
    public static int DIMMENTION = 8;
    Piece[][] pieces;
    Board() {
        pieces = new Piece[DIMMENTION][DIMMENTION];
        loadPieces();
    }

    private void loadPieces(){
        loadBlackPieces();
        loadEmptyPieces();
        loadWhitePieces();
    }

    private void loadBlackPieces(){
        pieces[0][0] = new Empty();
        pieces[0][1] = new Horse(Color.BLACK);
        pieces[0][2] = new Empty();
        pieces[0][3] = new Empty();
        pieces[0][4] = new King(Color.BLACK);
        pieces[0][5] = new Empty();
        pieces[0][6] = new Empty();
        pieces[0][7] = new Horse(Color.BLACK);
        for (int i = 0; i < DIMMENTION; i++) {
            pieces[1][i] = new Peon(Color.BLACK);
        }
    }

    private void loadEmptyPieces(){
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < DIMMENTION; j++) {
                pieces[i][j] = new Empty();
            }
        }
    }

    private void loadWhitePieces(){
        for (int i = 0; i < DIMMENTION; i++) {
            pieces[6][i] = new Peon(Color.WHITE);
        }
        pieces[7][0] = new Empty();
        pieces[7][1] = new Horse(Color.WHITE);
        pieces[7][2] = new Empty();
        pieces[7][3] = new Empty();
        pieces[7][4] = new King(Color.WHITE);
        pieces[7][5] = new Empty();
        pieces[7][6] = new Empty();
        pieces[7][7] = new Horse(Color.WHITE);
    }

    public void show(){
        for (int i = 0; i<DIMMENTION; i++){
            for (int j = 0; j<DIMMENTION; j++){
                pieces[i][j].print();
            }
            IO io = new IO();
            io.writeln();
        }
    }

    public Piece getPiece(Coord srcCoord) {
        return pieces[srcCoord.row][srcCoord.col];
    }

    public void setPiece(Piece piece, Coord dstCoord) {
        pieces[dstCoord.row][dstCoord.col] = piece;
    }

    public void unsetPiece(Coord coord) {
        pieces[coord.row][coord.col] = new Empty();
    }
}
