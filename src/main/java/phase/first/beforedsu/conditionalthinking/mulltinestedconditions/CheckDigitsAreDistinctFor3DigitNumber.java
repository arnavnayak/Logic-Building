package phase.first.beforedsu.conditionalthinking.mulltinestedconditions;

public class CheckDigitsAreDistinctFor3DigitNumber {

    public String checkDigitsAreDistinctIn3DigitNumber(int number){
        if(checkIfDigitIsAThreeDigitNumber(number)){
            int digit1 = number/100 ;
            int digit2 = (number/10)%10;
            int digit3 = number%10;

            if(digit1 != digit2 && digit2 != digit3 && digit1 != digit3){
                return "all digit are distinct";
            }
            return "all digits are not distinct";
        }
        return "not a three digit number";
    }

    public boolean checkIfDigitIsAThreeDigitNumber(int number) {
        return number >= 100 && number <= 999;
    }
}
