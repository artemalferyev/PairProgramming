public class RandomNum {

    int startOfRange;
    int endOfRange;
    public RandomNum(int start, int end ){
        this.startOfRange = start;
        this.endOfRange = end;

    }

    public static int randomNum(int startOfRange, int endOfRange){

        int randomNum = (int)Math.floor(Math.random()*(endOfRange-startOfRange)) + startOfRange;
        return randomNum;
    }
}
