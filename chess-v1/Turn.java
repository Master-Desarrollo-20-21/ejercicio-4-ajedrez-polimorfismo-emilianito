public class Turn {
    Player[] players;
    int counter = 0;
    public Turn(Player[] players) {
        assert players != null;
        assert players.length == 2;
        this.players = players;
    }

    public Player take() {
        return players[counter % 2];
    }

    public void change(){
        counter++;
    }
}
