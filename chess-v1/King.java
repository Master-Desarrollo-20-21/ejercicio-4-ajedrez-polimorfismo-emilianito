public class King extends Piece {
    public King(Color color) {
        super(color);
    }
    @Override
    public void print() {
        IO io = new IO();
        io.write("K" + color.getValue() + " ");
    }
    @Override
    public boolean isValidMovement(Coord srcCoord, Coord dstCoord) {
        return Math.abs(srcCoord.col - dstCoord.col) == 1
                && Math.abs(srcCoord.row - dstCoord.row) == 1
                && (dstCoord.color == null || srcCoord.color != dstCoord.color);
    }

    @Override
    public boolean isKing(){
        return true;
    }
}
