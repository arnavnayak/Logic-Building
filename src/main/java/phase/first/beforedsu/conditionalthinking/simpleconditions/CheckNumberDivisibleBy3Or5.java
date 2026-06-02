package phase.first.beforedsu.conditionalthinking.simpleconditions;

public class CheckNumberDivisibleBy3Or5 {

    public Boolean checkNumberDivisibleBy3Or5(int number){
        if(number % 3 == 0 && number % 5 == 0) {
            return true;
        }else{
            return false;
        }
    }
}
