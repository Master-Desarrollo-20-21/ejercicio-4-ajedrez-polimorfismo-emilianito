public class Peon extends Piece {
    public Peon(Color color) {
        super(color);
    }

    @Override
    public void print() {
        IO io = new IO();
        io.write("P" + color.getValue() + " ");
    }
    @Override
    public boolean isValidMovement(Coord srcCoord, Coord dstCoord) {

        IO io = new IO();
        io.writeln(""+diff(srcCoord.row, dstCoord.row, srcCoord.color));
        io.writeln(""+(srcCoord.col - dstCoord.col));

        if (diff(srcCoord.row, dstCoord.row, srcCoord.color) == 1
                && srcCoord.col - dstCoord.col == 0
                && dstCoord.color == Color.NONE) {
            return true;
        }

        return diff(srcCoord.row, dstCoord.row, srcCoord.color) == 1
                && Math.abs(srcCoord.col - dstCoord.col) == 1
                && dstCoord.color != Color.NONE
                && srcCoord.color != dstCoord.color;
    }

    private int diff(int n, int m, Color color){
        if (color == Color.WHITE){
            return n - m;
        }
        return m - n;
    }
}
