
public class Chess {

    Player[] players;
    Turn turn;
    Board board;
    Chess(){
        players = new Player[2];
        board = new Board();
        players[0] = new Player(Color.BLACK, board);
        players[1] = new Player(Color.WHITE, board);
        turn = new Turn(players);
    }

    public void play(){
        boolean mate = false;
        do {
            board.show();
            mate = turn.take().move();
            turn.change();
        }while(!mate);
        turn.change();
        turn.take().win();
    }

    public static void main(String[] args) {
        new Chess().play();
    }
}
