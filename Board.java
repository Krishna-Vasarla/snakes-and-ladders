class Board
{
    private int noOfPlayers;
    private int noOfSteps;
    String[] players;
    Board(int noOfPlayers,int noOfSteps){
        this.noOfPlayers = noOfPlayers;
        this.noOfSteps = noOfSteps;
        players = new String[noOfPlayers];
    }
    public int getBoardSize() {
        return noOfSteps;
    }
}
