package phase.first.beforedsu.looping.mathematicallooping;

public class FindTheHCFOrGCDOfGivenNumbers {

    public String returnHCFOfGivenNumbers(int num1,int num2){
        int largest = 0;
        int divisor = 0;
        int remainder = -1;
        //making sure number is non negative
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        //making sure larger number becomes divident
        if(num1 > num2){
            largest = num1;
            divisor = num2;
        }else{
            largest = num2;
            divisor = num1;
        }
        //making sure both number are not zero else its undefined to find HCF
        if(divisor == 0 && largest == 0) {
            return "the HCF of " + num1 + " and " + num2 + " is undefined";
        }
        //making sure if any one of the number is 0 then HCF is the largest number
        if(divisor == 0 || largest == 0){
            return "the HCF of " + num1 + " and " + num2 + " is " + (largest == 0 ? divisor : largest);
        }

        while (remainder != 0){
            remainder = largest % divisor;
            largest = divisor;
            divisor = remainder;

        }

        return "the HCF of " + num1 + " and " + num2 + " is " + largest; //the divisor is the HCF
    }
}
