package phase.first.beforedsu.looping.basiclooping;

import java.math.BigInteger;

public class FactorialOfANumber {

    public String returnFactorialOfANumber(int number){
        //constraint 1 : should be positive number only
        if(number<0){
            return "should be a positive number to calculate factorial";
        }
        //exceptions : for 0 and 1
        if(number == 0 || number == 1){
            return "factorial of " + number + " is 1";
        }
        //actual factorial logic
        //BigInteger result as it will reach memory limit for int at 12! and for long at 20!
        BigInteger result = BigInteger.ONE;
        for(int i=1;i<=number;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return "factorial of " + number + " is " + result;
    }
}
