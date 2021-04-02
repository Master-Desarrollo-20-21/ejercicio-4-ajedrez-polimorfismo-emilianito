public class Player {

    Board board;
    Color color;

    public Player(Color color, Board board) {
        this.color = color;
        this.board = board;
    }

    public boolean move() {

        boolean mate = false;
        IO io = new IO();
        io.writeln("Mueve " + color.getValue() + ":");

        Coord srcCoord = pedirOrigen();
        Coord dstCoord = pedirDestino();
        Piece srcPiece = board.getPiece(srcCoord);
        Piece dstPiece = board.getPiece(dstCoord);


        if(srcPiece.isValidMovement(srcCoord, dstCoord)){
            board.setPiece(srcPiece, dstCoord);
            board.unsetPiece(srcCoord);
            mate = dstPiece.isKing();
        } else {
            io.writeln("Movimiento invalido");
        }

        return mate;
    }

    private Coord pedirDestino(){
        return pedirCoord(new EQ());
    }

    private Coord pedirOrigen(){
        return pedirCoord(new NEQ());
    }

    private Coord pedirCoord(Comparation operator){
        boolean ok = false;
        IO io = new IO();
        Coord coord = new Coord();
        do {
            coord.read();
            Piece piece = board.getPiece(coord);
            if(operator.compare(color.ordinal(), piece.color.ordinal())){
                io.writeln("Movimiento no permitido");
            } else {
                coord.setColor(piece.color);
                ok = true;
            }
        } while (!ok);
        return coord;
    }

    public void win(){
        IO io = new IO();
        io.writeln(color.getValue() + " Ganan la partida!");
    }
}