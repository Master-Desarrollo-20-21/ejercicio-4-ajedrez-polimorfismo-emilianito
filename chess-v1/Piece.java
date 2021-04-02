abstract public class Piece {
    Color color;
    Piece(Color color) {
        this.color = color;
    }
    abstract public void print();
    public abstract boolean isValidMovement(Coord srcCoord, Coord dstCoord);
    boolean isKing(){
        return false;
    }
}
