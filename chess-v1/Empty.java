public class Empty extends Piece {
    public Empty() {
        super(Color.NONE);
    }

    @Override
    public void print() {
        IO io = new IO();
        io.write("-- " );
    }
    @Override
    public boolean isValidMovement(Coord srcCoord, Coord dstCoord) {
        return false;
    }
}
