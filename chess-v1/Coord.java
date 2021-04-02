public class Coord {
    int row, col;
    Color color;

    public void read() {
        IO io = new IO();
        this.row = io.readInt("Fila? ");
        this.col = io.readInt("Columna? ");
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
