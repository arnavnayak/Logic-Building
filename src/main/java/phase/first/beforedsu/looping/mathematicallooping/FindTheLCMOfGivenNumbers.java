package phase.first.beforedsu.looping.mathematicallooping;

public class FindTheLCMOfGivenNumbers {

    public String returnLCMOfGivenNumbers(int num1, int num2){
        //To find LCM shorted way is to follow the method and find HCF and divide the product of given number with the HCFof the numbers
        int lcm = 0;
        //making sure number is non negative
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        int hcf = returnHCFOfGivenNumbers(num1,num2);
        if(hcf != -1) { //for 0,0 case
            lcm = (num1 * num2) / hcf;
        }
        return "the LCM of " + num1 + " and " + num2 + " is " + lcm;
    }

    public int returnHCFOfGivenNumbers(int num1,int num2){
        int largest = 0;
        int divisor = 0;
        int remainder = -1;
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
            return -1;
        }
        //making sure if any one of the number is 0 then HCF is the largest number
        if(divisor == 0 || largest == 0){
            return largest == 0 ? divisor : largest;
        }

        while (remainder != 0){
            remainder = largest % divisor;
            largest = divisor;
            divisor = remainder;

        }

        return largest; //the divisor is the HCF
    }
}
