public class Game {
    public static void main(String[] args) {

        Master master = new Master(5,6,13 );
       Guessers guesser1 = new Guessers();
        Guessers guesser2 = new Guessers();
        RandomNum masterGuess = new RandomNum (master.startOfRange, master.endOfRange);
        RandomNum guesser1Guess  = new RandomNum(master.startOfRange, master.endOfRange);
        RandomNum guesser2Guess  = new RandomNum(master.startOfRange, master.endOfRange);

        int masterChoice = masterGuess.randomNum(master.startOfRange, master.endOfRange);
        guesser1.pick= guesser1Guess.randomNum(master.startOfRange, master.endOfRange);
       guesser2.pick = guesser2Guess.randomNum(master.startOfRange, master.endOfRange);

        
        /*boolean check = false;
         while(!check){

            if(master.masterCheck(masterGuess, guessers1Guess, guessers2Guess))  {
               check = true;
               
            }
guessers1Guess = guesser1.randomNumGuesser();
guessers2Guess = guesser2.randomNumGuesser();
                                    }               */


         for(int i = 0; i < master.numGuesses; i++) {
             if (master.masterCheck(masterChoice, guesser1.pick, guesser2.pick)) {
                 break;
             }

          //   master.masterCheck(masterChoice, guesser1.pick, guesser2.pick);
             guesser1.pick = guesser1Guess.randomNum(master.startOfRange, master.endOfRange);
             guesser2.pick = guesser2Guess.randomNum(master.startOfRange, master.endOfRange);
         }

    }
}