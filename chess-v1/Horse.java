public class Horse extends Piece {
    public Horse(Color color) {
        super(color);
    }
    @Override
    public void print() {
        IO io = new IO();
        io.write("H" + color.getValue() + " ");
    }

    @Override
    public boolean isValidMovement(Coord srcCoord, Coord dstCoord) {
        return false;
    }
}