class Dice
{
    public int throwDice(int numberOfDice){
       int value = (int)(Math.random()*(6*numberOfDice-1*numberOfDice)+1);
       if (value == numberOfDice*6){
           int sum =value;
           int count =1;
           while(true){
               if (count == 3){
                   return 0;
                }
               sum += (int)Math.random()*(6*numberOfDice-1*numberOfDice);
               count++;
                if (sum%(numberOfDice*6)==0){
                    continue;
                }
                else{
                    return sum;
                }
           }
       }
       return value;
    }
}
