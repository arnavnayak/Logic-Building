package phase.first.beforedsu.looping.basiclooping;

public class FindProductOfTheDigitsOfANumber {

    public String returnProductOfDigitsOfANumber(int num){
        int originalNum = num;
        if(num < 0){
            return "should be a positive number to calculate product of digits";
        }
        if(num == 0){
            return "product of digits of 0 is 0";
        }
        long product = 1;
        while(num > 0){
            //finding last digit
           int lastDigit = num % 10;
           //finding product of the digit
           product  = product * lastDigit;
           //removing last digit from the given number
           num = num / 10;
        }

        return "product of digits of " + originalNum + " is " + product;
    }
}
