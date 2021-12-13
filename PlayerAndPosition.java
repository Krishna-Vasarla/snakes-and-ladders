class PlayerAndPosition
{
    HashMap<String,Integer> pap = new HashMap<>();
    public void playerNPosition(String name,int position){
        pap.put(name,position);
    }
    public HashMap getPlayerAndPosition(){
        return pap;
        
    }
        
}
