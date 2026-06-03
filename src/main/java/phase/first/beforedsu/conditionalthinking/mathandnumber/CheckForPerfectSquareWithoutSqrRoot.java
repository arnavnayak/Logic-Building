package phase.first.beforedsu.conditionalthinking.mathandnumber;

public class CheckForPerfectSquareWithoutSqrRoot {

    public boolean checkPerfectSquare(int num){
        if(num < 0){
            return false;
        }
        if(num == 0 || num == 1 ){
            return true;
        }

        long start = 1;
        long end = num / 2; //The square root of a number > 1 is always <= num / 2

        while(start <= end){
            long mid = start + (end - start) / 2; //used to stop integer overflow
            long square = mid * mid;
            if(square == num){
                return true; //found the answer
            }else if (square < num){
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        return false;
    }
}
