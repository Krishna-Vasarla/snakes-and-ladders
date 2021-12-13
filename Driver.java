class Driver{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("No of Steps");
        int steps = input.nextInt();
        
        System.out.println("No of Players");
        int noOfPlayers = input.nextInt();
        
        System.out.println("Enter Players List");
        PlayerAndPosition  pp = new PlayerAndPosition();
        
        SnakesAndLadders sl = new SnakesAndLadders();
        Queue<String> players = new LinkedList<>();
        
        Board b = new Board(noOfPlayers, steps);

        for(int i=0; i<noOfPlayers; i++){
            String player = input.next();
            players.add(player);
            pp.playerNPosition(player,0);
            
            
        }
        System.out.println("No of Snakes");
        int snakes = input.nextInt();
        
        for(int i=0; i<snakes; i++){
            int start = input.nextInt();
            int end = input.nextInt();
            sl.snakesAndLadders(start,end);
        } 
        System.out.println("No of ladders");
        int ladders = input.nextInt();
        
        for(int i=0; i<ladders; i++){
            int start = input.nextInt();
            int end = input.nextInt();
            sl.snakesAndLadders(start,end);
        }
        System.out.println("Enter no of dice");
        int noOfDice = input.nextInt();

        HashMap<String,Integer> map;
        HashMap<Integer,Integer> pos;
        map = pp.getPlayerAndPosition();
        pos = sl.getSnakesAndLadders();
        RunningGame rg = new RunningGame(players,map, pos, b.getBoardSize(),noOfDice);

        rg.result();
        
    }
}
