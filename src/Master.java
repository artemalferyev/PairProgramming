public class Master {


    int numGuesses;
    int startOfRange;
    int endOfRange;

    public Master(int guess, int start, int end) {
        this.numGuesses = guess;
        this.startOfRange = start;
        this.endOfRange = end;

    }

    public static int randomNumMaster(int startOfRange, int endOfRange) {

        int randNumMaster = (int) Math.ceil(Math.random() * endOfRange) + startOfRange;
        return randNumMaster;
    }


    public boolean masterCheck(int num1, int num2, int num3) {
        if (num1 == num2 || num1 == num3) {
            System.out.println("Congratz, you are right! Guesser picked the same as Master: " + num1);
            return true;
        }
        System.out.println("You wrong. " + "The master number is " + num1 + ". The guesser 1 number is  " + num2 + ". The guesser 2 number is " + num3);
        return false;
    }

}