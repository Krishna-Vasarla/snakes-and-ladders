class RunningGame
{
    Dice dice = new Dice();
    HashMap<String,Integer> playerPosition;
    HashMap<Integer,Integer> snakesLadders;
    Queue<String> players;
    int boardSize;
    int noOfDice;
    RunningGame(Queue<String> players,HashMap<String, Integer> map,HashMap<Integer, Integer> pos, int boardSize,int noOfDice){
        this.players = players;
        playerPosition = map;
        snakesLadders = pos;
        this.boardSize = boardSize;
        this.noOfDice = noOfDice;
    }
    public void result() {
        int rank=0;
        while(true){
            String currPlayer = players.remove();
            players.add(currPlayer);
            int value = dice.throwDice(noOfDice);
            int currPos  = playerPosition.get(currPlayer);
            if(currPos+value == boardSize){
                System.out.println("Hurray!! "+currPlayer+" is the winner");
                break;
            }
            else if(currPos+value < boardSize){
                if (snakesLadders.containsKey(currPos+value)){
                    playerPosition.put(currPlayer,snakesLadders.get(currPos+value));
                    if (currPos>snakesLadders.get(currPos+value)) 
                        System.out.println(currPlayer+" caught by snake and moved to "+snakesLadders.get(currPos+value));
                    else 
                    System.out.println(currPlayer+" grabbed the ladder and moved to "+snakesLadders.get(currPos+value));
                }
                else{
                    playerPosition.put(currPlayer,currPos+value);
                    System.out.println(currPlayer+" moved to "+(currPos+value));
                }
            }
            else 
                System.out.println(currPlayer+" At same Position");
            
        }
    } 
}
