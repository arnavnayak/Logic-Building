package phase.first.beforedsu.conditionalthinking.mulltinestedconditions;

public class CheckMiddleDigitIsLargestSmallest {

    CheckDigitsAreDistinctFor3DigitNumber checkDigitsAreDistinctFor3DigitNumber = new CheckDigitsAreDistinctFor3DigitNumber();

    public String checkMiddleDigitIsLargestSmallestOrNeither(int number){
        if(checkDigitsAreDistinctFor3DigitNumber.checkIfDigitIsAThreeDigitNumber(number)){
            int digit1 = number/100;
            int digit2 = (number/10)%10;
            int digit3 = number%10;
            boolean largest = digit2 > digit1 && digit2 > digit3;
            boolean smallest = digit2 < digit1 && digit2 < digit3;
            if(largest || smallest){
                if(largest){
                    return "largest";
                }else{
                    return "smallest";
                }
            }else{
                return "neither largest nor smallest";
            }
        }
        return "not a three digit number";
    }
}
